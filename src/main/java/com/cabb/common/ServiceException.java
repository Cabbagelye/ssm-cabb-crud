package com.cabb.common;

/**
 * @ClassName ServiceException
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/25 14:47
 **/
public class ServiceException extends RuntimeException {


    public ServiceException(String message) {
        super(message);
    }

    public String getMsg(){
        String message = super.getMessage();
        return message;
    }
}
