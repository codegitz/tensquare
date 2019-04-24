package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: Quan
 *
 * @program: tensquare_parent
 *
 * @description:
 *
 * @create: 2019-04-03 23:47
 **/

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return  new Result(false, StatusCode.ERROR,e.getMessage());
    }

}
