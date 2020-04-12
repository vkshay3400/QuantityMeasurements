package com.bridglelabz.quantitymeasurement.service;

import com.bridglelabz.quantitymeasurement.conversions.TypesConversion;

import java.util.Objects;

public class MeasurementOfQuantity {
    //STATIC VARIABLES
    private static double FIRST_VALUE;
    private static double SECOND_VALUE;

    //METHOD TO GET CONVERSIONS

    public boolean getConversion(TypesConversion type, double beforeConversionValue, double afterConversionValue) {
        setPreValues(type);
        double operationOnFirstValue = beforeConversionValue * FIRST_VALUE;
        double operationOnSecondValue = afterConversionValue * SECOND_VALUE;

        if (Objects.equals(operationOnFirstValue, operationOnSecondValue))
            return true;
        return false;
    }

    //METHOD TO GET CONVERSION VALUE
    public double getConversionValue(TypesConversion type, Double beforeConversionValue, double afterConversionValue) {
        setPreValues(type);
        double operatedAfterValue = afterConversionValue * SECOND_VALUE;
        return operatedAfterValue;
    }

    //METHOD TO ADD CONVERSIONS
    public double addConversion(TypesConversion type, double beforeConversionValue, double afterConversionValue) {
        setPreValues(type);
        double finalValue = beforeConversionValue * type.firstValue;
        return finalValue;
    }

    //TO SET VALUES
    private void setPreValues(TypesConversion type) {
        FIRST_VALUE = type.firstValue;
        SECOND_VALUE = type.secondValue;
    }
}