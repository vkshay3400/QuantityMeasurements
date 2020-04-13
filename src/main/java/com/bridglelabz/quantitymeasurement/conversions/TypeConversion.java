package com.bridglelabz.quantitymeasurement.conversions;

public enum TypeConversion {
    FEET_TO_INCH(12, 1), INCH_TO_FEET(1, (1 / 12.0)),
    FEET_TO_YARD(1, 3), YARD_TO_FEET(3, 1),
    INCH_TO_YARD(1, 36), YARD_TO_INCH(36, 1),
    INCH_TO_CENTIMETER(5, 2), CENTIMETER_TO_INCH(2, 5),
    GALLON_TO_LITRE(3.78, 1), LITRE_TO_MILLILITRE(1, 1/1000.0),
    KILOGRAMS_TO_GRAMS(1000, 1), GRAMS_TO_KILOGRAMS(1, 1000),
    TONNE_TO_KILOGRAMS(1000, 1),FAHRENHEIT_TO_CELSIUS((5/9.0),1),
    CELSIUS_TO_FAHRENHEIT((9/5.0),1);

    public final double firstValue;
    public final double secondValue;

    TypeConversion(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
}