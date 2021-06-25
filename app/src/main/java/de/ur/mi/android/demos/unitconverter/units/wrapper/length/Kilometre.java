package de.ur.mi.android.demos.unitconverter.units.wrapper.length;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Kilometre extends SIValue {

    public Kilometre(double value) {
        super(value, Unit.KILOMETRE);
    }

    @Override
    public SIValue toBaseValue() {
        return new Metre(this.value * 1000);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Kilometre(base.value / 1000);
    }
}
