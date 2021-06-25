package de.ur.mi.android.demos.unitconverter.units.wrapper.time;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Millisecond extends SIValue {

    public Millisecond(double value) {
        super(value, Unit.MILLISECOND);
    }

    @Override
    public SIValue toBaseValue() {
        return new Second(this.value / 1000);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Millisecond(base.value * 1000);
    }
}
