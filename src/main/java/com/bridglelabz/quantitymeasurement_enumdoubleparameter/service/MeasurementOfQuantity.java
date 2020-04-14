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
    public boolean getConversion(TypeConversion type, double measurementFirstValue, double measurementSecondValue) {
        setPreValues(type);
        double operationOnFirstValue = measurementFirstValue * FIRST_VALUE;
        double operationOnSecondValue = measurementSecondValue * SECOND_VALUE;

        if (Objects.equals(operationOnFirstValue, operationOnSecondValue))
            return true;
        return false;
    }

    //METHOD TO GET TEMPERATURE CONVERSION
    public Double temperatureConversion(TypeConversion type, Double measurementFirstValue, double measurementSecondValue) {
        switch (type) {
            case FAHRENHEIT_TO_CELSIUS:
                return ((measurementFirstValue - 32) * type.firstValue);
            case CELSIUS_TO_FAHRENHEIT:
                return ((measurementFirstValue * type.firstValue) + 32);
            default:
                return null;
        }
    }

    //METHOD TO GET CONVERSION VALUE
    public double getConversionValue(TypeConversion type, Double measurementFirstValue, double measurementSecondValue) {
        setPreValues(type);
        double operatedAfterValue = measurementSecondValue * SECOND_VALUE;
        return operatedAfterValue;
    }

    //METHOD TO ADD CONVERSIONS
    public double addConversion(TypeConversion type, double measurementFirstValue, double measurementSecondValue) {
        setPreValues(type);
        double finalValue = measurementFirstValue * type.firstValue;
        return finalValue;
    }

    //TO SET VALUES
    private void setPreValues(TypeConversion type) {
        FIRST_VALUE = type.firstValue;
        SECOND_VALUE = type.secondValue;
    }

    //EQUAL METHOD
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        return super.equals(obj);
    }
}