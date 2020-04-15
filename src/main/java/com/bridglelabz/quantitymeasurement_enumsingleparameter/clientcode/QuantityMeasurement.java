package com.bridglelabz.quantitymeasurement_enumsingleparameter.service;

import com.bridglelabz.quantitymeasurement_enumsingleparameter.AdapterFactory;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.conversions.UnitTypeConversion;
import com.bridglelabz.quantitymeasurement_enumsingleparameter.exception.QuantityMeasurementException;

import java.util.Objects;

public class QuantityMeasurement {

    private final double unitValue;
    UnitTypeConversion unitTypeConversion;

    public QuantityMeasurement() {
        this.unitValue = 0;
    }

    public QuantityMeasurement(UnitTypeConversion unitTypeConversion, double unitValue) {
        this.unitTypeConversion = unitTypeConversion;
        this.unitValue = unitValue;
    }

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

    //VALUES
    public double getMeasurementValue() throws QuantityMeasurementException {
        double measurementValue = AdapterFactory.getQuantityObject(unitValue, unitTypeConversion);
        return measurementValue;
    }

    public boolean compare(QuantityMeasurement type) throws QuantityMeasurementException {
        if (this.unitTypeConversion.getMeasurementType() != type.unitTypeConversion.getMeasurementType())
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.UNIT_NOT_FOUND, "Unit not found");
        return true;
    }
//
//    public double additionOfMeasurement(QuantityMeasurement that) throws QuantityMeasurementException {
//        if (this.measurementType.getType() == UnitTypeConversion.TEMPERATURE && that.measurementType.getType() == MeasurementUnitTypes.TEMPERATURE)
//            throw new QuantityMeasurementException(QuantityMeasurementException.MyException.ADDITION_NOT_POSSIBLE, "You can't add temperature");
//        return this.measurementValue + that.measurementValue;
//    }
}


//public class QuantityMeasurement extends Conversions {
//    //STATIC VARIABLES
//    private static double VALUE;
//    public UnitTypeConversion type;
//
//    //CONSTRUCTOR
//    public QuantityMeasurement() {
//        super();
//    }
//
//    public double getMeasurementValue() throws QuantityMeasurementException {
//        double measurementValue = AdapterFactory.getQuantityObject(unitValue, measurementType);
//        return measurementValue;
//    }
//
//    public QuantityMeasurement(UnitTypeConversion type) {
//        this.type = type;
//    }
//
//    //METHOD TO GET CONVERSIONS
//    public double getConversion(UnitTypeConversion type, Double measurementValue){
//            //throws QuantityMeasurementException {
//        setPreValues(type);
//        if (type.equals(UnitTypeConversion.FAHRENHEIT))
//            return ((measurementValue - 32) * type.value);
//        return measurementValue = measurementValue * VALUE;
//    }
//
//    //TO SET VALUES
//    private void setPreValues(UnitTypeConversion type) {
//        VALUE = type.value;
//    }
//
//    //EQUALS METHOD
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        QuantityMeasurement that = (QuantityMeasurement) o;
//        return type == that.type;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(type);
//    }
//
////    //ADD METHOD
////    public Double addConversion(Double unit1, Double unit2) {
////        return unit1 + unit2;
////    }
//
//    //COMPARE
//    public boolean compare(QuantityMeasurement unit2) throws QuantityMeasurementException {
//        if (this.type.measurementType != unit2.type.measurementType)
//            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NOT_A_TYPE, "Not a type");
//        return true;
//    }
//}