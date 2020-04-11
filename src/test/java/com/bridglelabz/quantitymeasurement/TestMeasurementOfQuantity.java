package com.bridglelabz.quantitymeasurement;

import com.bridglelabz.quantitymeasurement.conversions.TypesConversion;
import com.bridglelabz.quantitymeasurement.service.MeasurementOfQuantity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMeasurementOfQuantity {

    MeasurementOfQuantity measurementOfQuantity;
    boolean measurements;
    double firstValue, secondValue, additionValue;

    @Before
    public void setMeasurementOfQuantity() throws Exception {
        measurementOfQuantity = new MeasurementOfQuantity();
    }

    //******* FEET -> INCHES *******
    @Test
    public void givenZeroFeet_WhenEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_TO_INCH, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenZeroFeet_WhenNotEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_TO_INCH, 0, 0);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenFeet_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.FEET_TO_INCH, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenFeetToInch_WhenEquality_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_TO_INCH, 4, 48);
        Assert.assertEquals(true, measurements);
    }

    //******* INCHES -> FEET *******
    @Test
    public void givenZeroInch_WhenEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_FEET, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenZeroInch_WhenNotEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_FEET, 0, 0);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenInch_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.INCH_TO_FEET, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    //******* FEET -> YARD *******
    @Test
    public void givenLength_WhenFeetEqualsYard_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_TO_YARD, 3, 1);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenInchNotEqualsYard_ShouldReturnNotEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_YARD, 1, 1);
        Assert.assertNotEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenYardEqualsInch_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.YARD_TO_INCH, 1, 36);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenInchEqualsYard_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_YARD, 36, 1);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenYardEqualsFeet_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.YARD_TO_FEET, 1, 3);
        Assert.assertEquals(true, measurements);
    }

    //******* INCH -> CENTIMETER *******
    @Test
    public void givenInInchCentimeter_WhenEqualsZero_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_CENTIMETER, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenInInchCentimeter_WhenEqualsNotZero_ShouldReturnNotEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_CENTIMETER, 2, 5);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenCentimeter_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.INCH_TO_CENTIMETER, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenInInch_WhenEqualsCentimeter_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_CENTIMETER, 2, 5);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenInchesAndInches_WhenAdded_ShouldReturnInInchesValue() {
        firstValue = measurementOfQuantity.addConversion(TypesConversion.INCH_TO_FEET, 2, 0);
        secondValue = measurementOfQuantity.addConversion(TypesConversion.INCH_TO_FEET, 2, 0);
        additionValue = firstValue + secondValue;
        Assert.assertEquals(4, additionValue, 0.0);
    }

    @Test
    public void givenFeetAndInches_WhenAdded_ShouldReturnInInchesValue() {
        firstValue = measurementOfQuantity.addConversion(TypesConversion.FEET_TO_INCH, 1, 0);
        secondValue = measurementOfQuantity.addConversion(TypesConversion.INCH_TO_FEET, 2, 0);
        additionValue = firstValue + secondValue;
        Assert.assertEquals(14, additionValue, 0.0);
    }

    @Test
    public void givenFeetAndFeet_WhenAdded_ShouldReturnInInchesValue() {
        firstValue = measurementOfQuantity.addConversion(TypesConversion.FEET_TO_INCH, 1, 0);
        secondValue = measurementOfQuantity.addConversion(TypesConversion.FEET_TO_INCH, 1, 0);
        additionValue = firstValue + secondValue;
        Assert.assertEquals(24, additionValue, 0.0);
    }

    @Test
    public void givenInchesAndCentimeter_WhenAdded_ShouldReturnInInchesValue() {
        firstValue = measurementOfQuantity.addConversion(TypesConversion.INCH_TO_FEET, 1, 0);
        secondValue = measurementOfQuantity.addConversion(TypesConversion.CENTIMETER_TO_INCH, 1, 0);
        additionValue = firstValue + secondValue;
        Assert.assertEquals(3, additionValue, 0.0);
    }

    //******* VOLUME -> GALLONS *******
    @Test
    public void givenGallonAndLitre_WhenEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.GALLON_TO_LITRE, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenGallonAndLitre_WhenNotEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.GALLON_TO_LITRE, 0, 0);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenGallonAndLitre_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.GALLON_TO_LITRE, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenGallonAndLitre_WhenEquality_ShouldReturnValue() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.GALLON_TO_LITRE, 1, 3.78);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEquals_ShouldReturnValue() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.LITRE_TO_MILLILITRE, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenNotEquals_ShouldReturnValue() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.LITRE_TO_MILLILITRE, 0, 0);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.LITRE_TO_MILLILITRE, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEquality_ShouldReturnValue() {
        double measurements = measurementOfQuantity.getConversionValue(TypesConversion.LITRE_TO_MILLILITRE, 1.0, 1000);
        Assert.assertEquals(1, measurements, 0.0);
    }

    //******* KILOGRAM -> GRAMS *******
    @Test
    public void givenKilogramsAndGrams_WhenEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.KILOGRAMS_TO_GRAMS, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenKilogramsAndGrams_WhenNotEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.KILOGRAMS_TO_GRAMS, 0, 0);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenKilogramsAndGrams_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.KILOGRAMS_TO_GRAMS, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenKilogramsAndGrams_WhenEquals_ShouldReturnValue() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.KILOGRAMS_TO_GRAMS, 1, 1000);
        Assert.assertEquals(true, measurements);
    }

    //******* TONNE -> KILOGRAM *******
    @Test
    public void givenTonneAndKilograms_WhenEquals_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.TONNE_TO_KILOGRAMS, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenTonneAndKilograms_WhenNotEquals_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.TONNE_TO_KILOGRAMS, 0, 0);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenTonneAndKilograms_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.TONNE_TO_KILOGRAMS, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenTonneAndKilograms_WhenEquality_ShouldReturnValue() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.TONNE_TO_KILOGRAMS, 1, 1000);
        Assert.assertEquals(true, measurements);
    }

    //******* TONNE -> GRAM *******
    @Test
    public void givenTonneAndGrams_WhenEquals_ShouldReturnInKilograms() {
        firstValue = measurementOfQuantity.addConversion(TypesConversion.TONNE_TO_KILOGRAMS, 1, 0);
        secondValue = measurementOfQuantity.addConversion(TypesConversion.GRAMS_TO_KILOGRAMS, 1, 0);
        additionValue = firstValue + secondValue;
        Assert.assertEquals(1001, additionValue, 0.0);
    }

    //******* FAHRENHEIT -> CELSIUS *******
    @Test
    public void givenFahrenheitCelsius_WhenZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.FAHRENHEIT_TO_CELSIUS, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenFahrenheitCelsius_WhenZero_ShouldReturnNotEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.FAHRENHEIT_TO_CELSIUS, 0, 0);
        Assert.assertNotEquals(false, measurements);
    }

    @Test
    public void givenFahrenheitCelsius_WhenNull_ShouldThrowException() throws NullPointerException {
        try {
            Double measurements = measurementOfQuantity.getConversionValue(TypesConversion.FAHRENHEIT_TO_CELSIUS, null, 0);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenFahrenheitCelsius_WhenEquality_ShouldReturnValue() {
        double measurements = measurementOfQuantity.getConversionValue(TypesConversion.FAHRENHEIT_TO_CELSIUS, 212.0, 100);
        Assert.assertEquals(212, measurements, 0.0);
    }
}