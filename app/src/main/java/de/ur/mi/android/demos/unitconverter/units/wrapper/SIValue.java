package de.ur.mi.android.demos.unitconverter.units.wrapper;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Centimetre;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Kilometre;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Metre;
import de.ur.mi.android.demos.unitconverter.units.wrapper.length.Millimetre;
import de.ur.mi.android.demos.unitconverter.units.wrapper.mass.Gram;
import de.ur.mi.android.demos.unitconverter.units.wrapper.mass.Kilogram;
import de.ur.mi.android.demos.unitconverter.units.wrapper.mass.Milligram;

public abstract class SIValue {

    public final double value;
    public final Unit unit;

    public SIValue (double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public SIValue toBaseValue() {
        return null;
    }

    public SIValue fromBaseValue(SIValue base) {
        return null;
    }

    public static SIValue wrapValue(double value, Unit unit) {
        switch (unit) {
            case MILLIMETRE:
                return new Millimetre(value);
            case CENTIMETRE:
                return new Centimetre(value);
            case METRE:
                return new Metre(value);
            case KILOMETRE:
                return new Kilometre(value);
            case MILLIGRAM:
                return new Milligram(value);
            case GRAM:
                return new Gram(value);
            case KILOGRAM:
                return new Kilogram(value);
            default:
                return null;
        }
    }

    public static SIValue wrapBaseValue(SIValue value, Unit unit) {
        switch (unit) {
            case MILLIMETRE:
                return new Millimetre(0).fromBaseValue(value);
            case CENTIMETRE:
                return new Centimetre(0).fromBaseValue(value);
            case METRE:
                return new Metre(0).fromBaseValue(value);
            case KILOMETRE:
                return new Kilometre(0).fromBaseValue(value);
            case MILLIGRAM:
                return new Milligram(0).fromBaseValue(value);
            case GRAM:
                return new Gram(0).fromBaseValue(value);
            case KILOGRAM:
                return new Kilogram(0).fromBaseValue(value);
            default:
                return null;
        }
    }


}
