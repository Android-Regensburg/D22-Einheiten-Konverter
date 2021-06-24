package de.ur.mi.android.demos.unitconverter.units;

public enum Quantity {
    TIME("Zeit"),
    LENGTH("Länge"),
    MASS("Masse");

    public final String name;

    Quantity(String name) {
        this.name = name;
    }
}
