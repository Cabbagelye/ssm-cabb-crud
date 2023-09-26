package com.cabb.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @ClassName FileService
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/25 15:04
 **/
public interface FileService {


    /**
     *
     * @param file
     */
    void getFileContent(MultipartFile file);
}
