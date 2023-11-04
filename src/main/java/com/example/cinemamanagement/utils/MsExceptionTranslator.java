package com.example.cinemamanagement.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

import static com.example.cinemamanagement.utils.ErrorMessage.ARGUMENT_NOT_VALID;

@RestControllerAdvice
public class MsExceptionTranslator {

    private final static Logger LOGGER = LoggerFactory.getLogger(MsExceptionTranslator.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseData<?>> methodArgumentNotValidException(MethodArgumentNotValidException ex) {
        HashMap<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(e -> errors.put(e.getField(), e.getDefaultMessage()));
        ResponseData<HashMap<String, String>> res = ResponseData.error(ARGUMENT_NOT_VALID, errors);
        return ResponseEntity.ok(res);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<ResponseData<?>> BusinessException(Exception ex) {
        LOGGER.error(ex.getMessage(), ex);
        if (ex instanceof BusinessException) {
            return ResponseEntity.ok(ResponseData.error(((BusinessException) ex).getError()));
        }
        if (ex.getCause() instanceof BusinessException) {
            BusinessException exception = (BusinessException) ex.getCause();
            return ResponseEntity.ok(ResponseData.error(exception.getError()));
        }
        BaseMessage message = new BaseMessage() {
            @Override
            public String getCode() {
                return "0001";
            }

            @Override
            public String getDesc() {
                return "Unhandled error";
            }

            @Override
            public ErrorMessage format(Object... str) {
                return null;
            }
        };
        return ResponseEntity.ok(ResponseData.error(message, ex.getMessage()));
    }

}
