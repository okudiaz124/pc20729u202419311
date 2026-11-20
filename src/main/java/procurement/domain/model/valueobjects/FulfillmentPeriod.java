package com.medisupply.platform.u202419311.procurement.domain.model.valueobjects;

import java.time.Localdate;
import com.medisupply.platform.u202419311.shared.domain.DomainValidationException;

public record FulfillmentPeriod(LocalDate startDate, LocalDare endDate) {
    public FulfillmentPeriod {
        if (startDate == null || endDate == null) {
            throw new DomainValidationException(
                    "period.required",
                    "Both period dates are required"
            );
        }
        if (!endDate.isAfter(startdate)) {
            throw new DomainValidationException(
                    "period.invalid"
                    "End date must be after start date"
            );
        }
    }
}
public boolean contains(LocalDate checkDate) {
    if (checkDate == null){
        throw new DomainValidationException(
                "period.check.required"
                "Date to check is required"
        );
    }
    return !checkDate.isBefore(startDate)
            && !checkDate.isAfter(endDate);
}