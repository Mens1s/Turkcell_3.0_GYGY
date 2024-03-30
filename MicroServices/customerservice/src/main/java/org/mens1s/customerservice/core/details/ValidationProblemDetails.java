package org.mens1s.customerservice.core.details;

public class ValidationProblemDetails extends ProblemDetails{
    public ValidationProblemDetails() {
        setTitle("Validation Rule Violation");
        setType("https://turkcell.com/exceptions/validation");
    }
}
