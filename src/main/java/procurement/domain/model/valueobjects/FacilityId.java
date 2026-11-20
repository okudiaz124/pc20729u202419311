package com.medisupply.platform.u202419311.procurement.domain.model.valueobjects;

import java.util.UUID;
import com.medisupply.platform.u202419311.shared.domain.DomainValidationException;

public record FacilityId(UUID value) {
    public FacilityId {
        if (value == null) {
            throw new DomainValidationException("facility.required", "Facility ID is required");
        }
    }
}
