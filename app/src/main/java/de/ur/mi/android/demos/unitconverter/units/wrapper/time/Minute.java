package de.ur.mi.android.demos.unitconverter.units.wrapper.time;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Minute extends SIValue {

    public Minute(double value) {
        super(value, Unit.MINUTE);
    }

    @Override
    public SIValue toBaseValue() {
        return new Second(this.value * 60);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Minute(base.value / 60);
    }
}
