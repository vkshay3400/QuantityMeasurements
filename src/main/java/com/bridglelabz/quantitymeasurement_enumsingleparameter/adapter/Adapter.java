package com.bridglelabz.quantitymeasurement_enumsingleparameter.adapter;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;

public abstract class Adapter {
    public double getConversionValue(double unitValue, double typeValue, UnitTypeConversion unitTypeConversion) throws QuantityMeasurementException {
        switch (unitTypeConversion) {
            case FAHRENHEIT:
                return (unitValue - 32) * typeValue;
            default:
                return (unitValue * typeValue);
        }
    }

    public abstract Double getConversionValue(UnitTypeConversion unitTypeConversion, double unit) throws QuantityMeasurementException;
}