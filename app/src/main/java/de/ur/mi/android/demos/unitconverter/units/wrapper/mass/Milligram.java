package de.ur.mi.android.demos.unitconverter.units.wrapper.mass;

import de.ur.mi.android.demos.unitconverter.units.Unit;
import de.ur.mi.android.demos.unitconverter.units.wrapper.SIValue;

public class Milligram extends SIValue {

    public Milligram(double value) {
        super(value, Unit.MILLIGRAM);
    }

    @Override
    public SIValue toBaseValue() {
        return new Kilogram(this.value / 1000000);
    }

    @Override
    public SIValue fromBaseValue(SIValue base) {
        return new Milligram(base.value * 1000000);
    }
}
