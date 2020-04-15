package com.bridglelabz.quantitymeasurement_enumsingleparameter;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.clientcode.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQuantityMeasurement {

    QuantityMeasurement quantityMeasurement = null;
    public double firstMeasurementValue, secondMeasurementValue;

    @Before
    public void setMeasurementOfQuantity() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement();
    }

    //******* FEET -> INCHES *******
    @Test
    public void givenZeroFeet_WhenEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenZeroFeet_WhenNotEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenFeet_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenFeetToInch_WhenCheckReferenceType_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, .0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetToInch_WhenEquality_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, 2.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 24.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    //******* INCHES -> FEET *******
    @Test
    public void givenZeroInch_WhenEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenZeroInch_WhenNotEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenInch_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenInchTOFeet_WhenCheckReferenceType_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchToFeet_WhenEquality_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 48.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 4.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    //******* FEET -> YARD *******
    @Test
    public void givenLength_WhenFeetEqualsYard_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, 3.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.YARD, 1.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenLength_WhenInchNotEqualsYard_ShouldReturnNotEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.YARD, 1.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenLength_WhenYardEqualsInch_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.YARD, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 36.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenLength_WhenInchEqualsYard_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 36.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.YARD, 1.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenLength_WhenYardEqualsFeet_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.YARD, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 3.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    //******* INCH -> CENTIMETER *******
    @Test
    public void givenInInchCentimeter_WhenEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.CENTIMETER, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenInInchCentimeter_WhenEqualsNotZero_ShouldReturnNotEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 8.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.CENTIMETER, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenCentimeter_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.CENTIMETER, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenInInch_WhenEqualsCentimeter_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 3.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.CENTIMETER, 7.5);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenInchesAndInches_WhenAdded_ShouldReturnInInchesValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 2.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 2.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        double additionValue = firstMeasurementValue + secondMeasurementValue;
        Assert.assertEquals(4, additionValue, 0.0);
    }

    @Test
    public void givenFeetAndInches_WhenAdded_ShouldReturnInInchesValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.INCH, 2.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        double additionValue = firstMeasurementValue + secondMeasurementValue;
        Assert.assertEquals(14, additionValue, 0.0);
    }

    @Test
    public void givenFeetAndFeet_WhenAdded_ShouldReturnInInchesValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FEET, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FEET, 1.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        double additionValue = firstMeasurementValue + secondMeasurementValue;
        Assert.assertEquals(24, additionValue, 0.0);
    }

    @Test
    public void givenInchesAndCentimeter_WhenAdded_ShouldReturnInInchesValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 2.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.CENTIMETER, 2.5);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        double additionValue = firstMeasurementValue + secondMeasurementValue;
        Assert.assertEquals(3, additionValue, 0.0);
    }

    //******* VOLUME -> GALLONS *******
    @Test
    public void givenGallonAndLitre_WhenEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.GALLON, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }


    @Test
    public void givenGallonAndLitre_WhenNotEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.GALLON, 10.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }


    @Test
    public void givenGallonAndLitre_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.GALLON, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenGallonAndLitre_WhenEquality_ShouldReturnValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.GALLON, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 3.78);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEquals_ShouldReturnValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.MILLILITRE, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenNotEquals_ShouldReturnValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 10.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.MILLILITRE, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenLitreAndMilliLitre_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.LITRE, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.MILLILITRE, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenLitreAndMilliLitre_WhenEquality_ShouldReturnValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 4.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.MILLILITRE, 4000.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    //******* KILOGRAM -> GRAMS *******
    @Test
    public void givenKilogramsAndGrams_WhenEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.GRAM, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenKilogramsAndGrams_WhenNotEqualsZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, 10.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.GRAM, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenKilogramsAndGrams_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.GRAM, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenKilogramsAndGrams_WhenEquals_ShouldReturnValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, 5.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.GRAM, 5000.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    //******* TONNE -> KILOGRAM *******
    @Test
    public void givenTonneAndKilograms_WhenEquals_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.TONNE, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenTonneAndKilograms_WhenNotEquals_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, 10.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.GRAM, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenTonneAndKilograms_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.GRAM, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenTonneAndKilograms_WhenEquality_ShouldReturnValue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.TONNE, 2.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, 2000.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    //******* TONNE -> GRAM *******
    @Test
    public void givenTonneAndGrams_WhenEquals_ShouldReturnInKilograms() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.TONNE, 1.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.GRAM, 1000.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        double additionValue = firstMeasurementValue + secondMeasurementValue;
        Assert.assertEquals(1001, additionValue, 0.0);
    }

    //******* FAHRENHEIT -> CELSIUS *******
    @Test
    public void givenFahrenheitCelsius_WhenZero_ShouldReturnEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenFahrenheitCelsius_WhenNotZero_ShouldReturnNotEquals() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 10.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenFahrenheitCelsius_WhenNull_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.CELSIUS, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenCelsiusToFahrenheit_WhenEqualsZero_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.CELSIUS, 0.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 0.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenCelsiusToFahrenheit_WhenNotEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.CELSIUS, 212.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 100.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertNotEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    @Test
    public void givenCelsiusToFahrenheit_WhenNotExactQuantityMeasure_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, null);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.CELSIUS, 0.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenFahrenheitToCelsius_WhenEquality_ShouldReturnInFahrenheit() throws QuantityMeasurementException {
        QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 212.0);
        QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.CELSIUS, 100.0);
        boolean result = measurementFirstValue.compare(measurementSecondValue);
        firstMeasurementValue = measurementFirstValue.getConversion();
        secondMeasurementValue = measurementSecondValue.getConversion();
        Assert.assertEquals(firstMeasurementValue, secondMeasurementValue, 0.0);
    }

    //******* TYPE CHECK : INCH -> FAHRENHEIT  *******
    @Test
    public void givenInchToFahrenheit_WhenNotEqual_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.INCH, 22.0);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.FAHRENHEIT, 100.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_FOUND, e.type);
        }
    }

    //******* TYPE CHECK : LITRE -> KILOGRAM  *******
    @Test
    public void givenLitreToKilogram_WhenNotEqual_ShouldThrowException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement measurementFirstValue = new QuantityMeasurement(UnitTypeConversion.LITRE, 5.0);
            QuantityMeasurement measurementSecondValue = new QuantityMeasurement(UnitTypeConversion.KILOGRAM, 200.0);
            boolean result = measurementFirstValue.compare(measurementSecondValue);
            firstMeasurementValue = measurementFirstValue.getConversion();
            secondMeasurementValue = measurementSecondValue.getConversion();
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_FOUND, e.type);
        }
    }
}