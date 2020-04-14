package com.bridglelabz.quantitymeasurement_enumdoubleparameter.service;

import com.bridglelabz.quantitymeasurement_enumdoubleparameter.conversions.Conversions;
import com.bridglelabz.quantitymeasurement_enumdoubleparameter.conversions.TypeConversion;

import java.util.Objects;

public class MeasurementOfQuantity extends Conversions {
    //STATIC VARIABLES
    private static double FIRST_VALUE;
    private static double SECOND_VALUE;

    //CONSTRUCTOR
    public MeasurementOfQuantity() {
        super();
    }

    //METHOD TO GET CONVERSIONS
    public boolean getConversion(TypeConversion type, double beforeConversionValue, double afterConversionValue) {
        setPreValues(type);
        double operationOnFirstValue = beforeConversionValue * FIRST_VALUE;
        double operationOnSecondValue = afterConversionValue * SECOND_VALUE;

        if (Objects.equals(operationOnFirstValue, operationOnSecondValue))
            return true;
        return false;
    }

    //METHOD TO GET TEMPERATURE CONVERSION
    public Double temperatureConversion(TypeConversion type, Double beforeConversionValue, double afterConversionValue) {
        switch (type) {
            case FAHRENHEIT_TO_CELSIUS:
                return ((beforeConversionValue - 32) * type.firstValue);
            case CELSIUS_TO_FAHRENHEIT:
                return ((beforeConversionValue * type.firstValue) + 32);
            default:
                return null;
        }
    }

    //EQUAL METHOD
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //METHOD TO GET CONVERSION VALUE
    public double getConversionValue(TypeConversion type, Double beforeConversionValue, double afterConversionValue) {
        setPreValues(type);
        double operatedAfterValue = afterConversionValue * SECOND_VALUE;
        return operatedAfterValue;
    }

    //METHOD TO ADD CONVERSIONS
    public double addConversion(TypeConversion type, double beforeConversionValue, double afterConversionValue) {
        setPreValues(type);
        double finalValue = beforeConversionValue * type.firstValue;
        return finalValue;
    }

    //TO SET VALUES
    private void setPreValues(TypeConversion type) {
        FIRST_VALUE = type.firstValue;
        SECOND_VALUE = type.secondValue;
    }
}