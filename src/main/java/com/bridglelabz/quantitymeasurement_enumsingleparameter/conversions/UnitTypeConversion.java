package com.bridglelabz.quantitymeasurement_enumsingleparameter.conversions;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.service.MeasurementOfQuantity;

public enum UnitTypeConversion {

    FEET(12.00, MeasurementType.LENGTH), INCH(1.00,MeasurementType.LENGTH),
    YARD(36.00, MeasurementType.LENGTH), CENTIMETER(1 / 2.50, MeasurementType.LENGTH),
    GALLON(3.78, MeasurementType.VOLUME), LITRE(1.00, MeasurementType.VOLUME),
    MILLILITRE(1 / (1000.00), MeasurementType.VOLUME),
    KILOGRAM(1.00, MeasurementType.WEIGHT), GRAM(1 / 1000.0, MeasurementType.WEIGHT), TONNE(1000.00, MeasurementType.WEIGHT),
    FAHRENHEIT(5 / 9.0, MeasurementType.VOLUME), CELSIUS(1.0, MeasurementType.VOLUME);

    public final double value;
    MeasurementType measurementType;

    UnitTypeConversion(double value, MeasurementType measurementType) {
        this.value = value;
        this.measurementType = measurementType;
    }
}