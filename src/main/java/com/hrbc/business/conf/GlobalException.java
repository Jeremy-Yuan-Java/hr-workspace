package com.hrbc.business.conf;


import com.hrbc.business.domain.common.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {
    private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);

    @ResponseBody
    @ExceptionHandler(Throwable.class)
    public ResponseDTO processException(Exception e) {
        logger.error("GlobalThrowable:", e);
        return new ResponseDTO(false, "操作失败", null);

    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseDTO processException1(Exception e) {
        logger.error("GlobalException:", e);
        return new ResponseDTO(false, "操作失败", null);

    }
}
