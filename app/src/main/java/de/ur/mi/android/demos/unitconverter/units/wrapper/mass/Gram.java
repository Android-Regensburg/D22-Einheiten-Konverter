package de.ur.mi.android.demos.unitconverter.units.wrapper.mass;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Gram extends SIValue {

    public Gram(double value) {
        super(value, Unit.GRAM);
    }

    @Override
    public SIValue toBaseValue() {
        return new Kilogram(this.value / 1000);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Gram(base.value * 1000);
    }
}
