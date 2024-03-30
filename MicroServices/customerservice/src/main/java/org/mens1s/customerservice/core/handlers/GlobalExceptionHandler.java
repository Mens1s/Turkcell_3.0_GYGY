package org.mens1s.customerservice.core.handlers;

import jakarta.validation.ConstraintViolationException;
import jakarta.xml.bind.ValidationException;
import org.mens1s.customerservice.core.details.BusinessProblemDetails;
import org.mens1s.customerservice.core.details.ProblemDetails;
import org.mens1s.customerservice.core.details.ValidationProblemDetails;
import org.mens1s.customerservice.core.types.BusinessException;
import org.mens1s.customerservice.core.types.ValidateException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // try
public class GlobalExceptionHandler {

    @ExceptionHandler({BusinessException.class}) // catch
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BusinessProblemDetails handleBusinessProblemDetails(BusinessException exception) {
        BusinessProblemDetails businessProblemDetails = new BusinessProblemDetails();
        businessProblemDetails.setDetail(exception.getMessage());
        return businessProblemDetails;
    }

    @ExceptionHandler({ValidationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationProblemDetails handleValidateProblemDetails(ValidateException validateException){
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
        validationProblemDetails.setDetail(validateException.getMessage());

        return validationProblemDetails;
    }

    @ExceptionHandler({ConstraintViolationException.class}) // Catch ConstraintViolationException
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationProblemDetails handleConstraintViolationException(ConstraintViolationException exception) {
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
        validationProblemDetails.setDetail(exception.getMessage());
        return validationProblemDetails;
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ProblemDetails handleOtherExceptions(){
        return new ProblemDetails("Internal Server Error!","Some error occurred!","..com/exceptions/internal");
    }
}
