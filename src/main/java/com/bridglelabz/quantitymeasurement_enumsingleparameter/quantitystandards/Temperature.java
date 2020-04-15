package com.bridglelabz.quantitymeasurement_enumsingleparameter.quantitystandards;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.adapter.Adapter;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;

public class Temperature extends Adapter {
    @Override
    public Double getConversionValue(UnitTypeConversion unitTypeConversion, double unit) throws QuantityMeasurementException {
        double fahrenheit = 5 / 9.0, celsius = 1;

        switch (unitTypeConversion) {
            case FAHRENHEIT:
                return super.getConversionValue(unit, fahrenheit, unitTypeConversion);
            case CELSIUS:
                return super.getConversionValue(unit, celsius, unitTypeConversion);
        }
        return null;
    }
}