package com.bridglelabz.quantitymeasurement_enumsingleparameter.exception;

public class QuantityMeasurementException extends Exception {
    public final ExceptionType type;

    public enum ExceptionType {
        UNIT_NOT_FOUND, NULL_VALUE;
    }

    public QuantityMeasurementException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}