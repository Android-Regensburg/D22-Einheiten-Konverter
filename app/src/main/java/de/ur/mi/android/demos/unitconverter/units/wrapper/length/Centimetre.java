package de.ur.mi.android.demos.unitconverter.units.wrapper.length;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Centimetre  extends SIValue {

    public Centimetre(double value) {
        super(value, Unit.CENTIMETRE);
    }

    @Override
    public SIValue toBaseValue() {
        return new Metre(this.value / 100);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Centimetre(base.value * 100);
    }
}
