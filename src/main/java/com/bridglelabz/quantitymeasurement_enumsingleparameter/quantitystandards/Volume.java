package com.bridglelabz.quantitymeasurement_enumsingleparameter.quantitystandards;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.adapter.Adapter;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;

public class Volume extends Adapter {
    @Override
    public Double getConversionValue(UnitTypeConversion unitTypeConversion, double unit) throws QuantityMeasurementException {
        double gallon = 3.78, litre = 1.0, yard = 36.00, millilitre = 1 / 1000.0;

        switch (unitTypeConversion) {
            case GALLON:
                return super.getConversionValue(unit, gallon, unitTypeConversion);
            case LITRE:
                return super.getConversionValue(unit, litre, unitTypeConversion);
            case MILLILITRE:
                return super.getConversionValue(unit, millilitre, unitTypeConversion);
        }
        return null;
    }
}