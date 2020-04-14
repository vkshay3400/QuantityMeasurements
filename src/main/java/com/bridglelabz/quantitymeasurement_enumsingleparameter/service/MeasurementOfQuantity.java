package com.bridglelabz.quantitymeasurement.service;

import com.bridglelabz.quantitymeasurement.conversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement.conversions.Conversions;

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
    public double temperatureConversion(UnitTypeConversion type, Double beforeConversionValue) {
        switch (type) {
            case FAHRENHEIT:
                return ((beforeConversionValue - 32) * type.value);
            case CELSIUS:
                return ((beforeConversionValue * type.value) + 32);
            default:
                return 0.0;
        }
    }

    //TO SET VALUES
    private void setPreValues(UnitTypeConversion type) {
        VALUE = type.value;
    }

    //EQUAL METHOD
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}