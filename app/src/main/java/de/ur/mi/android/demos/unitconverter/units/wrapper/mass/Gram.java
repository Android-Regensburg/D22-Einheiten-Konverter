package de.ur.mi.android.demos.unitconverter.units.wrapper.mass;

import de.ur.mi.android.demos.unitconverter.units.SICompatibleUnit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public class Gram extends UnitWrapper implements SICompatibleUnit {

    public Gram(double value) {
        super(value, "g");
    }

    @Override
    public UnitWrapper toBaseUnit(UnitWrapper unitWrapper) {
        return new Kilogram(this.value / 1000000);
    }

    @Override
    public UnitWrapper fromBaseUnit(UnitWrapper unitWrapper) {
        return new Gram(unitWrapper.value * 1000000);
    }
}
