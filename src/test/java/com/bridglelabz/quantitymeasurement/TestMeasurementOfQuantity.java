package com.bridglelabz.quantitymeasurement;

import com.bridglelabz.quantitymeasurement.conversions.TypesConversion;
import com.bridglelabz.quantitymeasurement.service.MeasurementOfQuantity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMeasurementOfQuantity {

    MeasurementOfQuantity measurementOfQuantity;
    boolean measurements;

    @Before
    public void setMeasurementOfQuantity() throws Exception {
        measurementOfQuantity = new MeasurementOfQuantity();
    }

    @Test
    public void givenZeroFeet_WhenEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_TO_INCH, 0, 0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenZeroInch_WhenEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_TO_FEET, 0,0);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenFeetEqualsYard_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_YARD, 3, 1);
        Assert.assertEquals(true, measurements);
    }

    @Test
    public void givenLength_WhenFeetNotEqualsYard_ShouldReturnNotEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.FEET_YARD, 1, 1);
        Assert.assertNotEquals(true, measurements);
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

    @Test
    public void givenInInch_WhenEqualsCentimeter_ShouldReturnEquals() {
        boolean measurements = measurementOfQuantity.getConversion(TypesConversion.INCH_CENTIMETER, 2, 5);
        Assert.assertEquals(true, measurements);
    }
}