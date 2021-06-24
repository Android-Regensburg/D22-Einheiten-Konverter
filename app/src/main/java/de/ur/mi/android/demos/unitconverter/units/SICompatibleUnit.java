package de.ur.mi.android.demos.unitconverter.units;

import de.ur.mi.android.demos.unitconverter.units.wrapper.UnitWrapper;

public interface SICompatibleUnit {
    UnitWrapper toBaseUnit(UnitWrapper unitWrapper);
    UnitWrapper fromBaseUnit(UnitWrapper unitWrapper);
}
