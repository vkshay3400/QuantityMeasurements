package com.bridglelabz.quantitymeasurement.conversions;

public enum TypesConversion {
    FEET_TO_INCH(1, 12);

    public final double firstValue ;
    public final double secondValue;

    TypesConversion(double firstValue, float secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
}