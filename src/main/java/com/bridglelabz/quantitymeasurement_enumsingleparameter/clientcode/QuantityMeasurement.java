package com.bridglelabz.quantitymeasurement_enumsingleparameter.clientcode;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.adapterfactory.AdapterFactory;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.unitconversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;

import java.util.Objects;

public class QuantityMeasurement {

    // VARIABLES
    public final double unitValue;
    public UnitTypeConversion unitTypeConversion;

    // CONSTRUCTOR TO SET VALUES
    public QuantityMeasurement() {
        this.unitValue = 0;
    }

    public QuantityMeasurement(UnitTypeConversion unitTypeConversion, Double unitValue) {
        this.unitTypeConversion = unitTypeConversion;
        this.unitValue = unitValue;
    }

    // METHOD TO GET CONVERSIONS
    public double getConversion() throws QuantityMeasurementException {
        double measurementValue = AdapterFactory.getQuantityType(unitValue, unitTypeConversion);
        return measurementValue;
    }

    // METHOD TO COMPARE
    public boolean compare(QuantityMeasurement type) throws QuantityMeasurementException {
        if (this.unitTypeConversion.getMeasurementType() != type.unitTypeConversion.getMeasurementType())
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.UNIT_NOT_FOUND, "Unit not found");
        return true;
    }

    // OVERRIDE EQUALS METHOD
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.unitValue, unitValue) == 0 &&
                unitTypeConversion == that.unitTypeConversion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitValue, unitTypeConversion);
    }
}