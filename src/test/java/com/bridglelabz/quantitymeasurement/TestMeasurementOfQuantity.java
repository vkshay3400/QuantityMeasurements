package com.bridglelabz.quantitymeasurement;

import com.bridglelabz.quantitymeasurement.conversions.TypesConversion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMeasurementOfQuantity {

    MeasurementOfQuantity measurementOfQuantity;
    double measurements;

    @Before
    public void setMeasurementOfQuantity() throws Exception {
        measurementOfQuantity = new MeasurementOfQuantity();
    }

    @Test
    public void givenZeroFeet_WhenEqualsZero_ShouldReturnEquals() {
        measurements = measurementOfQuantity.getConversions(TypesConversion.FEET_TO_INCH, 0);
        Assert.assertEquals(0, measurements, 0.0);
    }
}