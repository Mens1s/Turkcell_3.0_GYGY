package org.mens1s.customerservice.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mens1s.customerservice.services.constants.Messages;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCustomerRequest {
    @NotNull(message = Messages.ValidationErrors.NOT_BLANK)
    private Integer nationalityId;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String customerId;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String accountNumber;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String gsmNumber;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String firstName;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String lastName;

    @NotBlank(message = Messages.ValidationErrors.NOT_BLANK)
    private String orderNumber;
}
