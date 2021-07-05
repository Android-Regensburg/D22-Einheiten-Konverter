package de.ur.mi.android.demos.unitconverter.units.wrapper.length;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Metre extends SIValue {

    public Metre(double value) {
        super(value, Unit.METRE);
    }

    @Override
    public SIValue toBaseValue() {
        return new Metre(this.value);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Metre(base.value);
    }
}
