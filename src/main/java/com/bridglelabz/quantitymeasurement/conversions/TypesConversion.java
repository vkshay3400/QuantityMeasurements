package com.bridglelabz.quantitymeasurement.conversions;

public enum TypesConversion {
    FEET_TO_INCH(12, 1), INCH_TO_FEET(1, (1/12.0)),
    FEET_YARD(1, 3), YARD_FEET(3, 1),
    INCH_YARD(1, 36), YARD_INCH(36, 1),
    INCH_CENTIMETER(5,2 ),CENTIMETER_INCH(2,5 ),
    GALLON_TO_LITRE(3.78,1 ),LITRE_TO_GALLON(1,3.78),
    LITRE_TO_MILLILITRE(1000,1),MILLILITRE_TO_LITRE(1,1000);

    public final double firstValue;
    public final double secondValue;

    TypesConversion(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
}