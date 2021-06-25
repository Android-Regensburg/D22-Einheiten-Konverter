package de.ur.mi.android.demos.unitconverter.units.wrapper.time;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Second extends SIValue {

    public Second(double value) {
        super(value, Unit.SECOND);
    }

    @Override
    public SIValue toBaseValue() {
        return new Second(this.value);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Second(base.value);
    }
}
