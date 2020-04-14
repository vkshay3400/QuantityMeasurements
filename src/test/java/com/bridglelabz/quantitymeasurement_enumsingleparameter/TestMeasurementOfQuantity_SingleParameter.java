package com.bridglelabz.quantitymeasurement_enumsingleparameter;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.conversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.service.MeasurementOfQuantity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

public class TestMeasurementOfQuantity_SingleParameter {

    MeasurementOfQuantity measurementOfQuantity;
    public double measurementFirstValue;
    public double measurementSecondValue;
    boolean checkReference;

    @Before
    public void setMeasurementOfQuantity() throws Exception {
        measurementOfQuantity = new MeasurementOfQuantity();
    }

    //******* FEET -> INCHES *******
    @Test
    public void givenZeroFeet_WhenEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 0.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenZeroFeet_WhenNotEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 2.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 4.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenFeet_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 4.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenFeetToInch_WhenCheckReferenceType_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.equals(measurementOfQuantity);
        checkReference = Objects.equals(measurements, measurements);
        Assert.assertEquals(true, checkReference);
    }

    @Test
    public void givenFeetToInch_WhenEquality_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 2.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 24.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    //******* INCHES -> FEET *******
    @Test
    public void givenZeroInch_WhenEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 0.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenZeroInch_WhenNotEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 2.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 4.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenInch_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 4.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenInchTOFeet_WhenCheckReferenceType_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.equals(measurementOfQuantity);
        checkReference = Objects.equals(measurements, measurements);
        Assert.assertEquals(true, checkReference);
    }

    @Test
    public void givenInchToFeet_WhenEquality_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 24.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 2.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    //******* FEET -> YARD *******
    @Test
    public void givenLength_WhenFeetEqualsYard_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 3.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.YARD, 1.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenLength_WhenInchNotEqualsYard_ShouldReturnNotEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 1.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.YARD, 1.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenLength_WhenYardEqualsInch_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.YARD, 1.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 36.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenLength_WhenInchEqualsYard_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 36.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.YARD, 1.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenLength_WhenYardEqualsFeet_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.YARD, 1.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 3.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    //    //******* INCH -> CENTIMETER *******
    @Test
    public void givenInInchCentimeter_WhenEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 0.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenInInchCentimeter_WhenEqualsNotZero_ShouldReturnNotEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 20.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 10.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenCentimeter_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.CENTIMETER, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.CENTIMETER, 4.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenInInch_WhenEqualsCentimeter_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 3.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.CENTIMETER, 7.5);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenInchesAndInches_WhenAdded_ShouldReturnInInchesValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 2.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 2.0);
        double additionValue = measurementFirstValue + measurementSecondValue;
        Assert.assertEquals(4, additionValue, 0.0);
    }

    @Test
    public void givenFeetAndInches_WhenAdded_ShouldReturnInInchesValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 1.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 2.0);
        double additionValue = measurementFirstValue + measurementSecondValue;
        Assert.assertEquals(14, additionValue, 0.0);
    }

    @Test
    public void givenFeetAndFeet_WhenAdded_ShouldReturnInInchesValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 1.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.FEET, 1.0);
        double additionValue = measurementFirstValue + measurementSecondValue;
        Assert.assertEquals(24, additionValue, 0.0);
    }

    @Test
    public void givenInchesAndCentimeter_WhenAdded_ShouldReturnInInchesValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.INCH, 2.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.CENTIMETER, 2.5);
        double additionValue = measurementFirstValue + measurementSecondValue;
        Assert.assertEquals(3, additionValue, 0.0);
    }

    //******* VOLUME -> GALLONS *******
    @Test
    public void givenGallonAndLitre_WhenEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.GALLON, 0.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenGallonAndLitre_WhenNotEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.GALLON, 10.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, 20.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenGallonAndLitre_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.GALLON, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, 2.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenGallonAndLitre_WhenEquality_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.GALLON, 1.00);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, 3.78);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEquals_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, 0.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.MILLILITRE, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenNotEquals_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, 20.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.MILLILITRE, 40.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.MILLILITRE, 3.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEquality_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.LITRE, 4.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.MILLILITRE, 4000.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    //******* KILOGRAM -> GRAMS *******
    @Test
    public void givenKilogramsAndGrams_WhenEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, 0.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.GRAM, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenKilogramsAndGrams_WhenNotEqualsZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, 10.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.GRAM, 60.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenKilogramsAndGrams_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.GRAM, 4.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenKilogramsAndGrams_WhenEquals_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, 5.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.GRAM, 5000.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    //******* TONNE -> KILOGRAM *******
    @Test
    public void givenTonneAndKilograms_WhenEquals_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.TONNE, 0.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenTonneAndKilograms_WhenNotEquals_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.TONNE, 10.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, 16.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenTonneAndKilograms_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.TONNE, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, 6.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenTonneAndKilograms_WhenEquality_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.TONNE, 2.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.KILOGRAM, 2000.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    //******* TONNE -> GRAM *******
    @Test
    public void givenTonneAndGrams_WhenEquals_ShouldReturnInKilograms() {
        measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.TONNE, 1.0);
        measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.GRAM, 1000.0);
        double additionValue = measurementFirstValue + measurementSecondValue;
        Assert.assertEquals(1001, additionValue, 0.0);
    }

    //******* FAHRENHEIT -> CELSIUS *******
    @Test
    public void givenFahrenheitCelsius_WhenZero_ShouldReturnEquals() {
        measurementFirstValue = measurementOfQuantity.temperatureConversion(UnitTypeConversion.FAHRENHEIT, 0.0);
        measurementSecondValue = measurementOfQuantity.temperatureConversion(UnitTypeConversion.FAHRENHEIT, 0.0);
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenFahrenheitCelsius_WhenNotZero_ShouldReturnNotEquals() {
        measurementFirstValue = measurementOfQuantity.temperatureConversion(UnitTypeConversion.FAHRENHEIT, 10.0);
        measurementSecondValue = measurementOfQuantity.temperatureConversion(UnitTypeConversion.FAHRENHEIT, 0.0);
        Assert.assertNotEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenFahrenheitCelsius_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.FAHRENHEIT, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.CELSIUS, 4.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenFahrenheitToCelsius_WhenEquality_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.temperatureConversion(UnitTypeConversion.FAHRENHEIT, 50.0);
        measurementSecondValue = 10.0;
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenCelsiusToFahrenheit_WhenEquality_ShouldReturnValue() {
        measurementFirstValue = measurementOfQuantity.temperatureConversion(UnitTypeConversion.CELSIUS, 70.0);
        measurementSecondValue = 158.0;
        Assert.assertEquals(measurementFirstValue, measurementSecondValue, 0.0);
    }

    @Test
    public void givenCelsiusToFahrenheit_WhenNotExactQuantityMeasure_ShouldThrowException() throws NullPointerException {
        try {
            measurementFirstValue = measurementOfQuantity.getConversion(UnitTypeConversion.CELSIUS, null);
            measurementSecondValue = measurementOfQuantity.getConversion(UnitTypeConversion.FAHRENHEIT, 4.0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }
}