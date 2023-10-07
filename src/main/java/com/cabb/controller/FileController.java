package com.cabb.controller;

import com.cabb.error.ServiceException;
import com.cabb.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @ClassName FileController
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/25 14:42
 **/
@Controller
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileService fileService;

    /**
     * 获取文件内容
     * @param file
     */
    @PostMapping("/getFileContent")
    @ResponseBody
    public void getFileContent(MultipartFile file){

        if (null == file){
            throw new ServiceException("文件不能为空!!!!");
        }
        //
        fileService.getFileContent(file);

    }

}
