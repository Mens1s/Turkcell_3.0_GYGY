package com.turkcell.pair3.customerservice.core.exception;
import com.turkcell.pair3.customerservice.core.types.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler({BusinessException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleRuntimeException(BusinessException exception)
    {
        return exception.getMessage();
    }
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handleValidationException(MethodArgumentNotValidException exception)
    {
        Map<String,String> errors = new HashMap<>();

        List<FieldError> validationErrors = exception.getBindingResult().getFieldErrors();

        for(FieldError error : validationErrors)
        {
            errors.put(error.getField(), error.getDefaultMessage());
        }
        return errors;
    }

    // NullReferenceException
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleException(Exception exception)
    {
        return "Bilinmedik hata";
    }
}