package de.ur.mi.android.demos.unitconverter.units.wrapper.time;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Hour extends SIValue {

    public Hour(double value) {
        super(value, Unit.MINUTE);
    }

    @Override
    public SIValue toBaseValue() {
        return new Second(this.value * 3600);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Hour(base.value / 3600);
    }
}
