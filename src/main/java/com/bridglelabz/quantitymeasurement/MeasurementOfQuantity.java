package com.bridglelabz.quantitymeasurement;

import com.bridglelabz.quantitymeasurement.conversions.TypesConversion;

public class MeasurementOfQuantity {
    private static double FIRST_VALUE;
    private static double SECOND_VALUE;

    public double getConversions(TypesConversion type, double value) {
        setPreValues(type);
        double operatedAfterValue = value * SECOND_VALUE;
        return operatedAfterValue;
    }

    private void setPreValues(TypesConversion type) {
        FIRST_VALUE = type.firstValue;
        SECOND_VALUE = type.secondValue;

    }
}