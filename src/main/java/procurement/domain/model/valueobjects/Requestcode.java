package com.medisupply.platform.u202419311.procurement.domain.valueobjects;
import com.medisupply.platform.u202419311.shared.domain.DomainValidationException;

public record RequestCode(String code) {
    public Requestcode {
        if (code ==null || code.isBlank()) {
            throw new DomainValidationException(
                    "request.code.required",
                    "Request code is required:"
            );
        }
    }
}

public class Requestcode {
}
