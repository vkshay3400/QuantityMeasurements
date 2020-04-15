package com.bridglelabz.quantitymeasurement_enumsingleparameter.quantitystandards;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.adapter.Adapter;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;

public class Weight extends Adapter {
    @Override
    public Double getConversionValue(UnitTypeConversion unitTypeConversion, double unit) throws QuantityMeasurementException {
        double kilogram = 1.00, gram = 1 / 1000.0, tonne = 1000;

        switch (unitTypeConversion) {
            case KILOGRAM:
                return super.getConversionValue(unit, kilogram, unitTypeConversion);
            case GRAM:
                return super.getConversionValue(unit, gram, unitTypeConversion);
            case TONNE:
                return super.getConversionValue(unit, tonne, unitTypeConversion);
        }
        return null;
    }
}