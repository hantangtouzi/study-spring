package com.hantangtouzi.mvcexception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author WilliamChang.
 * Created on 2018/7/12 10:36
 */

@ControllerAdvice
public class BusinessExceptionHandler {
    @ExceptionHandler({UserNotFoundException.class})
    public String handlerUserNotFound() {
        return "error/500";
    }
}
