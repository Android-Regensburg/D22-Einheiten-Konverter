package de.ur.mi.android.demos.unitconverter.units;

public enum Unit {
    MILLIMETRE("mm", Quantity.LENGTH),
    CENTIMETRE("cm", Quantity.LENGTH),
    METRE("m", Quantity.LENGTH),
    KILOMETRE("km", Quantity.LENGTH),
    MILLIGRAM("mg", Quantity.MASS),
    GRAM("g", Quantity.MASS),
    KILOGRAM("kg", Quantity.MASS),
    MILLISECOND("ms", Quantity.TIME),
    SECOND("sec", Quantity.TIME),
    MINUTE("min", Quantity.TIME),
    HOUR("h", Quantity.TIME);

    public final String label;
    public final Quantity quantity;

    Unit(String label, Quantity quantity) {
        this.label = label;
        this.quantity = quantity;
    }
}
