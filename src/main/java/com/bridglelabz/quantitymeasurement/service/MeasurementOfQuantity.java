package com.bridglelabz.quantitymeasurement.service;

import com.bridglelabz.quantitymeasurement.conversions.TypesConversion;

public class MeasurementOfQuantity {
    private static double FIRST_VALUE;
    private static double SECOND_VALUE;

    public double getConversions(TypesConversion type, double value) {
        setPreValues(type);
        double operatedAfterValue = value * SECOND_VALUE;
        return operatedAfterValue;
    }

    public boolean getYardFeetConversions(TypesConversion type, double value1, double value2) {
        setPreValues(type);
        double operation1 = value1 * FIRST_VALUE;
        double operation2 = value2 * SECOND_VALUE;
        if (operation1 == operation2) {
            return true;
        } else {
            return false;
        }
    }

    private void setPreValues(TypesConversion type) {
        FIRST_VALUE = type.firstValue;
        SECOND_VALUE = type.secondValue;
    }
}