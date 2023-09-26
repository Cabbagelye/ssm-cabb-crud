package com.cabb.service.impl;

import com.cabb.common.Constant;
import com.cabb.service.FileService;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/**
 * @ClassName FileServiceImpl
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/25 15:05
 **/
@Service
public class FileServiceImpl implements FileService {

    /**
     *
     * @param file
     */
    @Override
    public void getFileContent(MultipartFile file) {
        //获取文件后缀类型
        String originalFilename = file.getOriginalFilename();
        String suffixName = originalFilename.substring(file.getOriginalFilename().lastIndexOf("."));
        switch (suffixName.toLowerCase(Locale.ROOT)){
            case Constant.PDF:getPdfContent(file);break;
            case Constant.XLSX:getExcelContent(file);break;
            case Constant.XLS:getExcelContent(file);break;
            case Constant.DOCX:getWordContent(file);break;
            case Constant.DOC:getWordContent(file);break;
        }

    }


    /**
     *
     * @param file
     */
    @Transactional(rollbackFor = Exception.class)
    public void getPdfContent(MultipartFile file) {
        System.out.println("this is pdf");
        //MultipartFile转File
//        File fileFile = doMultipartFileToFile(file);
        try {
            //
            PDDocument pdDocument = PDDocument.load(file.getInputStream());

            PDFTextStripper textStripper = new PDFTextStripper();

            String text = textStripper.getText(pdDocument);

            System.out.println(text);

            pdDocument.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * MultipartFile转File
     * @param file
     * @return
     */
    private File doMultipartFileToFile(MultipartFile file) {

        File tempFile = null;
        try {
            String originalFilename = file.getOriginalFilename();
            String[] fileName = originalFilename.split("\\.");
            tempFile = File.createTempFile(fileName[0], fileName[1]);
            file.transferTo(tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempFile;
    }

    /**
     *
     * @param file
     */
    @Transactional(rollbackFor = Exception.class)
    public void getExcelContent(MultipartFile file) {
        System.out.println("this is excel");
    }

    /**
     *
     * @param file
     */
    @Transactional(rollbackFor = Exception.class)
    public void getWordContent(MultipartFile file) {
        System.out.println("this is word");
    }
}
