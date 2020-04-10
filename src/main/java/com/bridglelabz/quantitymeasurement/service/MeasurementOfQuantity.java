package com.bridglelabz.quantitymeasurement.service;

import com.bridglelabz.quantitymeasurement.conversions.TypesConversion;

public class MeasurementOfQuantity {
    //STATIC VARIABLES
    private static double FIRST_VALUE;
    private static double SECOND_VALUE;

    //METHOD TO GET CONVERSIONS
    public boolean getConversion(TypesConversion type, double value1, double value2) {
        setPreValues(type);
        double operation1 = value1 * FIRST_VALUE;
        double operation2 = value2 * SECOND_VALUE;

        if (operation1 == operation2)
            return true;
        if (operation1 != operation2)
            return false;
        return true;
    }

    //METHOD TO ADD CONVERSIONS
    public double addConversion(TypesConversion type, double value1, double value2) {
        setPreValues(type);
        double operation3 = value1 * type.firstValue;
        double finalValue = operation3;
        return finalValue;
    }

    //TO SET VALUES
    private void setPreValues(TypesConversion type) {
        FIRST_VALUE = type.firstValue;
        SECOND_VALUE = type.secondValue;
    }
}