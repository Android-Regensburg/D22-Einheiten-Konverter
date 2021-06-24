package de.ur.mi.android.demos.unitconverter.units.wrapper.length;

import de.ur.mi.android.demos.unitconverter.units.SICompatibleUnit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class Kilometre  extends UnitWrapper implements SICompatibleUnit {

    public Kilometre(double value) {
        super(value, "km");
    }

    @Override
    public UnitWrapper toBaseUnit(UnitWrapper unitWrapper) {
        return new Meter(this.value * 1000);
    }

    @Override
    public UnitWrapper fromBaseUnit(UnitWrapper unitWrapper) {
        return new Kilometre(unitWrapper.value / 1000);
    }
}
