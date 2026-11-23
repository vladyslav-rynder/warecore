package com.warecore.common.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ErrorMessages {
    public final String ENTITY_NOT_FOUND = "%s not found with id: %s";
    public final String ENTITY_ALREADY_EXISTS = "%s with %s '%s' already exists";
    public final String VALIDATION_FAILED = "Input validation failed";
    public final String INTERNAL_SERVER_ERROR = "An unexpected error occurred";
}