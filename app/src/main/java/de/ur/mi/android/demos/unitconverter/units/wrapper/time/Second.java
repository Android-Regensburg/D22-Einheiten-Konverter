package de.ur.mi.android.demos.unitconverter.units.wrapper.time;

import de.ur.mi.android.demos.unitconverter.units.SICompatibleUnit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class Second extends UnitWrapper implements SICompatibleUnit {

    public Second(double value) {
        super(value, "s");
    }

    @Override
    public UnitWrapper toBaseUnit(UnitWrapper unitWrapper) {
        return new Second(this.value);
    }

    @Override
    public UnitWrapper fromBaseUnit(UnitWrapper unitWrapper) {
        return new Second(unitWrapper.value);
    }
}
