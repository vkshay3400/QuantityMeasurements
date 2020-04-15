package com.bridglelabz.quantitymeasurement_enumsingleparameter;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.conversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.clientcode.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQuantityMeasurement {

    QuantityMeasurement quantityMeasurement;
    public double measurementFirstValue;
    public double measurementSecondValue;
    boolean checkReference;

    @Before
    public void setMeasurementOfQuantity() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    //******* FEET -> INCHES *******
    @Test
    public void givenZeroFeet_WhenEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 0.0);
        measurementFirstValue.getMeasurementValue();
        measurementSecondValue.getMeasurementValue();
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        Assert.assertEquals(true,result);
    }
//
//
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 10.0);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 10.0);
//        boolean areEqual = measurementFirstValue.compare(measurementSecondValue);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//
//    @Test
//    public void givenZeroFeet_WhenNotEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 2.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 4.0, MeasurementType.LENGTH);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenFeet_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, null, MeasurementType.LENGTH);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 4.0, MeasurementType.LENGTH);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenFeetToInch_WhenCheckReferenceType_ShouldReturnEquals() {
//        boolean measurements = quantityMeasurement.equals(quantityMeasurement);
//        checkReference = Objects.equals(measurements, measurements);
//        Assert.assertEquals(true, checkReference);
//    }
//
//    @Test
//    public void givenFeetToInch_WhenEquality_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 2.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 24.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    //******* INCHES -> FEET *******
//    @Test
//    public void givenZeroInch_WhenEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 0.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 0.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenZeroInch_WhenNotEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 2.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 4.0, MeasurementType.LENGTH);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenInch_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, null, MeasurementType.LENGTH);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 4.0, MeasurementType.LENGTH);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenInchTOFeet_WhenCheckReferenceType_ShouldReturnEquals() {
//        boolean measurements = quantityMeasurement.equals(quantityMeasurement);
//        checkReference = Objects.equals(measurements, measurements);
//        Assert.assertEquals(true, checkReference);
//    }
//
//    @Test
//    public void givenInchToFeet_WhenEquality_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 24.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 2.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    //******* FEET -> YARD *******
//    @Test
//    public void givenLength_WhenFeetEqualsYard_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 3.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.YARD, 1.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenLength_WhenInchNotEqualsYard_ShouldReturnNotEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 1.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.YARD, 1.0, MeasurementType.LENGTH);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenLength_WhenYardEqualsInch_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.YARD, 1.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 36.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenLength_WhenInchEqualsYard_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 36.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.YARD, 1.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenLength_WhenYardEqualsFeet_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.YARD, 1.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 3.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    //    //******* INCH -> CENTIMETER *******
//    @Test
//    public void givenInInchCentimeter_WhenEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 0.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 0.0, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenInInchCentimeter_WhenEqualsNotZero_ShouldReturnNotEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 20.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 10.0, MeasurementType.LENGTH);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenCentimeter_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.CENTIMETER, null, MeasurementType.LENGTH);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.CENTIMETER, 4.0, MeasurementType.LENGTH);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenInInch_WhenEqualsCentimeter_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 3.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.CENTIMETER, 7.5, MeasurementType.LENGTH);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenInchesAndInches_WhenAdded_ShouldReturnInInchesValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 2.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 2.0, MeasurementType.LENGTH);
//        double additionValue = measurementFirstValue + measurementSecondValue;
//        Assert.assertEquals(4, additionValue, 0.0);
//    }
//
//    @Test
//    public void givenFeetAndInches_WhenAdded_ShouldReturnInInchesValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 1.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 2.0, MeasurementType.LENGTH);
//        double additionValue = measurementFirstValue + measurementSecondValue;
//        Assert.assertEquals(14, additionValue, 0.0);
//    }
//
//    @Test
//    public void givenFeetAndFeet_WhenAdded_ShouldReturnInInchesValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 1.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FEET, 1.0, MeasurementType.LENGTH);
//        double additionValue = measurementFirstValue + measurementSecondValue;
//        Assert.assertEquals(24, additionValue, 0.0);
//    }
//
//    @Test
//    public void givenInchesAndCentimeter_WhenAdded_ShouldReturnInInchesValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.INCH, 2.0, MeasurementType.LENGTH);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.CENTIMETER, 2.5, MeasurementType.LENGTH);
//        double additionValue = measurementFirstValue + measurementSecondValue;
//        Assert.assertEquals(3, additionValue, 0.0);
//    }
//
//    //******* VOLUME -> GALLONS *******
//    @Test
//    public void givenGallonAndLitre_WhenEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.GALLON, 0.0, MeasurementType.VOLUME);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 0.0, MeasurementType.VOLUME);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenGallonAndLitre_WhenNotEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.GALLON, 10.0, MeasurementType.VOLUME);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 20.0, MeasurementType.VOLUME);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenGallonAndLitre_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.GALLON, null, MeasurementType.VOLUME);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 2.0, MeasurementType.VOLUME);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenGallonAndLitre_WhenEquality_ShouldReturnValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.GALLON, 1.00, MeasurementType.VOLUME);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 3.78, MeasurementType.VOLUME);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenLitreAndMilliLitre_WhenEquals_ShouldReturnValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 0.0, MeasurementType.VOLUME);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.MILLILITRE, 0.0, MeasurementType.VOLUME);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenLitreAndMilliLitre_WhenNotEquals_ShouldReturnValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 20.0, MeasurementType.VOLUME);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.MILLILITRE, 40.0, MeasurementType.VOLUME);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenLitreAndMilliLitre_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, null, MeasurementType.VOLUME);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.MILLILITRE, 3.0, MeasurementType.VOLUME);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenLitreAndMilliLitre_WhenEquality_ShouldReturnValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.LITRE, 4.0, MeasurementType.VOLUME);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.MILLILITRE, 4000.0, MeasurementType.VOLUME);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    //******* KILOGRAM -> GRAMS *******
//    @Test
//    public void givenKilogramsAndGrams_WhenEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, 0.0, MeasurementType.WEIGHT);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.GRAM, 0.0, MeasurementType.WEIGHT);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenKilogramsAndGrams_WhenNotEqualsZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, 10.0, MeasurementType.WEIGHT);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.GRAM, 60.0, MeasurementType.WEIGHT);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenKilogramsAndGrams_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, null, MeasurementType.WEIGHT);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.GRAM, 4.0, MeasurementType.WEIGHT);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenKilogramsAndGrams_WhenEquals_ShouldReturnValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, 5.0, MeasurementType.WEIGHT);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.GRAM, 5000.0, MeasurementType.WEIGHT);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    //******* TONNE -> KILOGRAM *******
//    @Test
//    public void givenTonneAndKilograms_WhenEquals_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.TONNE, 0.0, MeasurementType.WEIGHT);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, 0.0, MeasurementType.WEIGHT);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenTonneAndKilograms_WhenNotEquals_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.TONNE, 10.0, MeasurementType.WEIGHT);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, 16.0, MeasurementType.WEIGHT);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenTonneAndKilograms_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.TONNE, null, MeasurementType.WEIGHT);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, 6.0, MeasurementType.WEIGHT);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenTonneAndKilograms_WhenEquality_ShouldReturnValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.TONNE, 2.0, MeasurementType.WEIGHT);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.KILOGRAM, 2000.0, MeasurementType.WEIGHT);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    //******* TONNE -> GRAM *******
//    @Test
//    public void givenTonneAndGrams_WhenEquals_ShouldReturnInKilograms() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.TONNE, 1.0, MeasurementType.WEIGHT);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.GRAM, 1000.0, MeasurementType.WEIGHT);
//        double additionValue = measurementFirstValue + measurementSecondValue;
//        Assert.assertEquals(1001, additionValue, 0.0);
//    }
//
//    //******* FAHRENHEIT -> CELSIUS *******
//    @Test
//    public void givenFahrenheitCelsius_WhenZero_ShouldReturnEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, 0.0, MeasurementType.TEMPERATURE);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, 0.0, MeasurementType.TEMPERATURE);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenFahrenheitCelsius_WhenNotZero_ShouldReturnNotEquals() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, 10.0, MeasurementType.TEMPERATURE);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, 0.0, MeasurementType.TEMPERATURE);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenFahrenheitCelsius_WhenNull_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, null, MeasurementType.TEMPERATURE);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.CELSIUS, 4.0, MeasurementType.TEMPERATURE);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
//
//    @Test
//    public void givenFahrenheitToCelsius_WhenEquality_ShouldReturnValue() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, 212.0, MeasurementType.TEMPERATURE);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.CELSIUS, 100.0, MeasurementType.TEMPERATURE);
//        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenCelsiusToFahrenheit_WhenNotEqual_ShouldReturnFalse() {
//        measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.CELSIUS, 75.0, MeasurementType.TEMPERATURE);
//        measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, 158.0, MeasurementType.TEMPERATURE);
//        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
//    }
//
//    @Test
//    public void givenCelsiusToFahrenheit_WhenNotExactQuantityMeasure_ShouldThrowException() throws NullPointerException {
//        try {
//            measurementFirstValue = quantityMeasurement.getConversion(UnitTypeConversion.CELSIUS, null, MeasurementType.TEMPERATURE);
//            measurementSecondValue = quantityMeasurement.getConversion(UnitTypeConversion.FAHRENHEIT, 4.0, MeasurementType.TEMPERATURE);
//        } catch (NullPointerException e) {
//            Assert.assertEquals(null, e.getMessage());
//        }
//    }
}