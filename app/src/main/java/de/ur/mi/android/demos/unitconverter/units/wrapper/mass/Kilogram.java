package de.ur.mi.android.demos.unitconverter.units.wrapper.mass;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Kilogram extends SIValue {

    public Kilogram(double value) {
        super(value, Unit.KILOGRAM);
    }

    @Override
    public SIValue toBaseValue() {
        return new Kilogram(this.value);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Kilogram(base.value);
    }
}
