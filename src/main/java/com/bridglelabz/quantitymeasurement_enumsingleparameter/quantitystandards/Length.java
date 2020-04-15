package com.bridglelabz.quantitymeasurement_enumsingleparameter.quantitystandards;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.adapter.Adapter;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;

public class Length extends Adapter {
    @Override
    public Double getConversionValue(UnitTypeConversion unitTypeConversion, double unit) throws QuantityMeasurementException {
        double feet = 12.00, inch = 1.0, yard = 36.00, centimeter = 1 / 2.50;

        switch (unitTypeConversion) {
            case FEET:
                return super.getConversionValue(unit, feet, unitTypeConversion);
            case INCH:
                return super.getConversionValue(unit, inch, unitTypeConversion);
            case YARD:
                return super.getConversionValue(unit, yard, unitTypeConversion);
            case CENTIMETER:
                return super.getConversionValue(unit, centimeter, unitTypeConversion);
        }
        return null;
    }
}