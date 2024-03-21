package com.fleetcontrol.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    Long uploadImage(MultipartFile multipartImage) throws Exception;

    Resource downloadImage(Long imageId) throws Exception;

}
