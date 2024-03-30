package org.mens1s.customerservice.core.details;

public class BusinessProblemDetails extends ProblemDetails{
    public BusinessProblemDetails() {
        setType("https://turkcell.com/exceptions/business");
        setTitle("Business Rule Violation");
    }
}
