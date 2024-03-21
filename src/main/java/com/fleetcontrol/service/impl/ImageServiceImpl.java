package com.fleetcontrol.service.impl;

import com.fleetcontrol.model.Image;
import com.fleetcontrol.repository.ImageRepository;
import com.fleetcontrol.service.ImageService;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Long uploadImage(MultipartFile multipartImage) throws Exception {

        String imageNameId = UUID.randomUUID().toString();

        Image image = new Image();
        image.setName(imageNameId);
        image.setContent(multipartImage.getBytes());

        return imageRepository.save(image).getId();
    }

    @Override
    public Resource downloadImage(Long imageId) throws Exception {

        byte[] image = imageRepository.findById(imageId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND))
                .getContent();

        return new ByteArrayResource(image);
    }

}
