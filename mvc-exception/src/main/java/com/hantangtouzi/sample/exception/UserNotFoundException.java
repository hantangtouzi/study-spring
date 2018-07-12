package com.hantangtouzi.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author WilliamChang.
 * Created on 2018/7/12 9:58
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User Not Found")
public class UserNotFoundException extends BusinessException {

}
