package com.bridglelabz.quantitymeasurement.conversions;

public enum TypesConversion {
    FEET_TO_INCH(1, 12), INCH_TO_FEET(1, (1 / 12)),
    FEET_YARD(1, 3), YARD_FEET(3, 1),
    INCH_YARD(1, 36), YARD_INCH(36, 1),
    INCH_CENTIMETER(5,2 );

    public final double firstValue;
    public final double secondValue;

    TypesConversion(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
}