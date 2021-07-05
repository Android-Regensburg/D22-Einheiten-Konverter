package de.ur.mi.android.demos.unitconverter.units.wrapper.length;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Millimetre extends SIValue {

    public Millimetre(double value) {
        super(value, Unit.MILLIMETRE);
    }

    @Override
    public SIValue toBaseValue() {
        return new Metre(this.value / 1000);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Millimetre(base.value * 1000);
    }
}
