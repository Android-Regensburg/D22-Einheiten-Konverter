package de.ur.mi.android.demos.unitconverter.units.wrapper.time;

import de.ur.mi.android.demos.unitconverter.units.SICompatibleUnit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class Millisecond extends UnitWrapper implements SICompatibleUnit {

    public Millisecond(double value) {
        super(value, "m");
    }

    @Override
    public UnitWrapper toBaseUnit(UnitWrapper unitWrapper) {
        return new Second(this.value / 1000);
    }

    @Override
    public UnitWrapper fromBaseUnit(UnitWrapper unitWrapper) {
        return new Millisecond(unitWrapper.value * 1000);
    }
}
