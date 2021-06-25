package de.ur.mi.android.demos.unitconverter.units;

public enum Quantity {
    TIME("Time"),
    LENGTH("Length"),
    MASS("Mass");

    public final String name;

    Quantity(String name) {
        this.name = name;
    }
}
