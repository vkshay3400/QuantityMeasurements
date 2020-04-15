package com.bridglelabz.quantitymeasurement_enumsingleparameter.adapterfactory;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.quantitystandards.*;

public abstract class AdapterFactory {
    public static Double getQuantityType(double unit, UnitTypeConversion unitTypeConversion) throws QuantityMeasurementException {
        if (unitTypeConversion == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null measurement type");

        switch (unitTypeConversion) {
            case FEET:
            case INCH:
            case YARD:
            case CENTIMETER:
                return new Length().getConversionValue(unitTypeConversion, unit);
            case GALLON:
            case LITRE:
            case MILLILITRE:
                return new Volume().getConversionValue(unitTypeConversion, unit);
            case KILOGRAM:
            case GRAM:
            case TONNE:
                return new Weight().getConversionValue(unitTypeConversion, unit);
            case CELSIUS:
            case FAHRENHEIT:
                return new Temperature().getConversionValue(unitTypeConversion, unit);
            default:
                return null;
        }
    }
}