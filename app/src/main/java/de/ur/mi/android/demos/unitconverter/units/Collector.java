package de.ur.mi.android.demos.unitconverter.units;

import android.util.Log;

import java.util.ArrayList;

import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Collector {

    public static Unit[] getUnitsForQuantity(Quantity quantity) {
        ArrayList<Unit> units = new ArrayList<>();
        for (Unit unit : Unit.values()) {
            if (unit.quantity == quantity) {
                units.add(unit);
            }
        }
        return units.toArray(new Unit[0]);
    }

    public static SIValue[] getConvertedValuesFor(double value, Unit originalUnit) {
        SIValue originalValue = SIValue.wrapValue(value, originalUnit);
        if (originalValue == null) {
            return null;
        }
        SIValue baseValue = originalValue.toBaseValue();
        Unit[] targetUnits = Collector.getUnitsForQuantity(originalUnit.quantity);
        ArrayList<SIValue> targetValues = new ArrayList<>();
        for (Unit unit : targetUnits) {
            targetValues.add(SIValue.wrapBaseValue(baseValue, unit));
        }
        return targetValues.toArray(new SIValue[0]);
    }
}
