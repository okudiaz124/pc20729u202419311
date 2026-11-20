package com.medisupply.platform.u202419311.shared.domain;

public class DomainValidationException extends IllegalArgumentException {
    private final String key;

    public DomainValidationException(String key, String message) {
        super(message);
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}