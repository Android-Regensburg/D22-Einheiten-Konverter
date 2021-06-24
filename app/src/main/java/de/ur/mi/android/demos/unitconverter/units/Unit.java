package de.ur.mi.android.demos.unitconverter.units;

import java.util.ArrayList;

import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Centimetre;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Kilometre;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Meter;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Millimetre;
import de.ur.mi.android.demos.unitconverter.units.wrapper.mass.Gram;
import de.ur.mi.android.demos.unitconverter.units.wrapper.mass.Kilogram;
import de.ur.mi.android.demos.unitconverter.units.wrapper.mass.Milligram;
import de.ur.mi.android.demos.unitconverter.units.wrapper.mass.Ton;
import de.ur.mi.android.demos.unitconverter.units.wrapper.time.Hour;
import de.ur.mi.android.demos.unitconverter.units.wrapper.time.Millisecond;
import de.ur.mi.android.demos.unitconverter.units.wrapper.time.Minute;
import de.ur.mi.android.demos.unitconverter.units.wrapper.time.Second;


public enum Unit {
    MILLIMETRE("mm", Quantity.LENGTH),
    CENTIMETRE("cm", Quantity.LENGTH),
    METER("m", Quantity.LENGTH),
    KILOMETRE("km", Quantity.LENGTH),
    MILLIGRAM("mg", Quantity.MASS),
    GRAM("g", Quantity.MASS),
    KILOGRAM("kg", Quantity.MASS),
    TON("t", Quantity.MASS),
    MILLISECOND("ms", Quantity.TIME),
    SECOND("sec", Quantity.TIME),
    MINUTE("min", Quantity.TIME),
    HOUR("h", Quantity.TIME);

    public final String label;
    public final Quantity quantity;

    Unit(String label, Quantity quantity) {
        this.label = label;
        this.quantity = quantity;
    }

    public UnitWrapper wrapValue(double value) {
        switch (this.name()) {
            case "MILLIMETRE":
                return new Millimetre(value);
            case "CENTIMETRE":
                return new Centimetre(value);
            case "METER":
                return new Meter(value);
            case "KILOMETRE":
                return new Kilometre(value);
            case "MILLIGRAM":
                return new Milligram(value);
            case "GRAM":
                return new Gram(value);
            case "KILOGRAM":
                return new Kilogram(value);
            case "TON":
                return new Ton(value);
            case "MILLISECOND":
                return new Millisecond(value);
            case "SECOND":
                return new Second(value);
            case "MINUTE":
                return new Minute(value);
            case "HOUR":
                return new Hour(value);
            default:
                return null;
        }
    }

    public UnitWrapper wrapFromBaseValueWrapper(UnitWrapper wrappedBaseValue) {
        switch (this.name()) {
            case "MILLIMETRE":
                return new Millimetre(0).fromBaseUnit(wrappedBaseValue);
            case "CENTIMETRE":
                return new Centimetre(0).fromBaseUnit(wrappedBaseValue);
            case "METER":
                return new Meter(0).fromBaseUnit(wrappedBaseValue);
            case "KILOMETRE":
                return new Kilometre(0).fromBaseUnit(wrappedBaseValue);
            case "MILLIGRAM":
                return new Milligram(0).fromBaseUnit(wrappedBaseValue);
            case "GRAM":
                return new Gram(0).fromBaseUnit(wrappedBaseValue);
            case "KILOGRAM":
                return new Kilogram(0).fromBaseUnit(wrappedBaseValue);
            case "TON":
                return new Ton(0).fromBaseUnit(wrappedBaseValue);
            case "MILLISECOND":
                return new Millisecond(0).fromBaseUnit(wrappedBaseValue);
            case "SECOND":
                return new Second(0).fromBaseUnit(wrappedBaseValue);
            case "MINUTE":
                return new Minute(0).fromBaseUnit(wrappedBaseValue);
            case "HOUR":
                return new Hour(0).fromBaseUnit(wrappedBaseValue);
            default:
                return null;
        }
    }


    public static Unit[] getUnitsForQuantity(Quantity quantity) {
        ArrayList<Unit> units = new ArrayList<>();
        for (Unit unit : Unit.values()) {
            if (unit.quantity == quantity) {
                units.add(unit);
            }
        }
        return units.toArray(new Unit[0]);
    }
}
