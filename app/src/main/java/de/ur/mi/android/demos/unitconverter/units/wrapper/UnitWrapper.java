package de.ur.mi.android.demos.unitconverter.units.wrapper;

public abstract class UnitWrapper {

    public final double value;
    public final String symbol;

    public UnitWrapper(double value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

}
