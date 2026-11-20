package com.medisupply.platform.u202419311.procurement.domain.model.valueobjects;

import com.medisupply.platform.u202419311.shared.domain.DomainValidationException;

public record SupplyBatch(Integer quantity, String unit) {
    public SupplyBatch {
        if (quantity == null || quantity <= 0) {
            throw new DomainValidationException("batch.quantity.invalid", "Quantity must be greater than zero");
        }
        if (unit == null || unit.isBlank()) {
            throw new DomainValidationException("batch.unit.required", "Supply unit is required");
        }
    }

    public SupplyBatch addUnits(Integer additionalQuantity) {

        if (additionalQuantity == null || additionalQuantity <= 0
                || quantity > Integer.MAX_VALUE - additionalQuantity) {
            throw new DomainValidationException("batch.increment.invalid", "Invalid additional quantity");
        }
        return new SupplyBatch(quantity + additionalQuantity, unit);
    }
}