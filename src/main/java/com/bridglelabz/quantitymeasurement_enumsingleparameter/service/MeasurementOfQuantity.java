package com.bridglelabz.quantitymeasurement_enumsingleparameter.service;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.conversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.conversions.Conversions;

public class MeasurementOfQuantity extends Conversions {
    //STATIC VARIABLES
    private static double VALUE;

    //CONSTRUCTOR
    public MeasurementOfQuantity() {
        super();
    }

    //METHOD TO GET CONVERSIONS
    public double getConversion(UnitTypeConversion type, Double beforeConversionValue) {
        setPreValues(type);
        double afterConversionValue = beforeConversionValue * VALUE;
        return afterConversionValue;
    }

    //METHOD TO GET TEMPERATURE CONVERSION
    public Double temperatureConversion(UnitTypeConversion type, Double beforeConversionValue) {
        switch (type) {
            case FAHRENHEIT:
                return ((beforeConversionValue - 32) * type.value);
            case CELSIUS:
                return ((beforeConversionValue * type.value) + 32);
            default:
                return null;
        }
    }

    //TO SET VALUES
    private void setPreValues(UnitTypeConversion type) {
        VALUE = type.value;
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