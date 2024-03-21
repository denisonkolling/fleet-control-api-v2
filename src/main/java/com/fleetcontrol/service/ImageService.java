package com.fleetcontrol.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    Long uploadImage(MultipartFile multipartImage) throws Exception;

}
