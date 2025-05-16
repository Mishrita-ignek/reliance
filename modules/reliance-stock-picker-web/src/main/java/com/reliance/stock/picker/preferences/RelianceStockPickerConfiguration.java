package com.reliance.stock.picker.preferences;
import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "com.reliance.stock.picker.preferences.RelianceStockPickerConfiguration")
public interface RelianceStockPickerConfiguration {

    @Meta.AD(deflt = "ABC",
            name = "symbol",
            required = false
    )
    public String symbol();

    @Meta.AD(deflt = "Reliance Infrastructure",
            name = "name",
            required = false
    )
    public String name();

}
