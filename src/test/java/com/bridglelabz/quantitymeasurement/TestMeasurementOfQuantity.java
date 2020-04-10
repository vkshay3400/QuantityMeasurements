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
    public void givenZeroFeet_WhenEqualsZero_ShouldThrowException() throws NullPointerException {
        try {
            measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_TO_INCH, 0, 10);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenZeroFeet_WhenEquality_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_TO_INCH, 1, 12);
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
    public void givenZeroInch_WhenEqualsZero_ShouldThrowException() throws NullPointerException {
        try {
            measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_FEET, 0, 10);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenZeroInch_WhenEquality_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_FEET, 1, 12);
        Assert.assertEquals(true, measurements);
    }

    //******* FEET -> YARD *******
    @Test
    public void givenLength_WhenFeetEqualsYard_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_YARD, 3, 1);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenInchNotEqualsYard_ShouldReturnNotEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_YARD, 1, 1);
        Assert.assertNotEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenYardEqualsInch_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.YARD_INCH, 1, 36);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenInchEqualsYard_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_YARD, 36, 1);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenYardEqualsFeet_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.YARD_FEET, 1, 3);
        Assert.assertEquals(true, measurements);
    }

    //******* INCH -> CENTIMETER *******
    @Test
    public void givenInInch_WhenEqualsCentimeter_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_CENTIMETER, 2, 5);
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
        secondValue = measurementOfQuantity.addConversion(TypesConversion.CENTIMETER_INCH, 1, 0);
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
    public void givenLitreAndMilliLitre_WhenEquality_ShouldReturnValue() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.LITRE_TO_MILLILITRE, 1, 1000);
        Assert.assertEquals(true, measurements);
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
}