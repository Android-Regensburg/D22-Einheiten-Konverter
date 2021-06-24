package de.ur.mi.android.demos.unitconverter.units.wrapper.time;

import de.ur.mi.android.demos.unitconverter.units.SICompatibleUnit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class Hour extends UnitWrapper implements SICompatibleUnit {

    public Hour(double value) {
        super(value, "h");
    }

    @Override
    public UnitWrapper toBaseUnit(UnitWrapper unitWrapper) {
        return new Second(this.value * 3600);
    }

    @Override
    public UnitWrapper fromBaseUnit(UnitWrapper unitWrapper) {
        return new Hour(unitWrapper.value / 3600);
    }
}
