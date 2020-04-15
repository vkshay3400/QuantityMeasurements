package com.bridglelabz.quantitymeasurement_enumsingleparameter.conversions;

public enum UnitTypeConversion {

    FEET(MeasurementType.LENGTH), INCH(MeasurementType.LENGTH),
    YARD(MeasurementType.LENGTH), CENTIMETER(MeasurementType.LENGTH),
    GALLON(MeasurementType.VOLUME), LITRE(MeasurementType.VOLUME),
    MILLILITRE(MeasurementType.VOLUME),
    KILOGRAM(MeasurementType.WEIGHT), GRAM(MeasurementType.WEIGHT),
    TONNE(MeasurementType.WEIGHT),
    FAHRENHEIT(MeasurementType.VOLUME), CELSIUS(MeasurementType.VOLUME);

    private final MeasurementType measurementType;

    UnitTypeConversion(MeasurementType measurementType) {
        this.measurementType = measurementType;
    }
    public MeasurementType getMeasurementType(){
        return measurementType;
    }
}