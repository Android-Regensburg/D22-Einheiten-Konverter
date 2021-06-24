package de.ur.mi.android.demos.unitconverter.units.wrapper.mass;

import de.ur.mi.android.demos.unitconverter.units.SICompatibleUnit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class Milligram extends UnitWrapper implements SICompatibleUnit {

    public Milligram(double value) {
        super(value, "mg");
    }

    @Override
    public UnitWrapper toBaseUnit(UnitWrapper unitWrapper) {
        return new Kilogram(this.value / 1000);
    }

    @Override
    public UnitWrapper fromBaseUnit(UnitWrapper unitWrapper) {
        return new Milligram(unitWrapper.value * 1000);
    }
}
