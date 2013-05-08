package com.rafaelromao.javaStatePattern.poc;

import java.util.ArrayList;
import java.util.List;

public abstract class OnOff
{
    //region Undelying Values
    public static final byte onValue = 0;
    public static final byte offValue = 1;
    //endregion

    //region State Values
    private static OnOff _on = new OnState();
    public static OnOff on()
    {
        return _on;
    }

    private static OnOff _off = new OffState();
    public static OnOff off()
    {
        return _off;
    }

    public static List<OnOff> states()
    {
        ArrayList<OnOff> result = new ArrayList<OnOff>();
        result.add(OnOff.on());
        result.add(OnOff.off());
        return result;
    }
    //endregion

    //region Constructors
    protected OnOff(byte value)
    {
        this._value = value;
    }
    //endregion

    //region Properties
    protected byte _value;
    public byte value()
    {
        return _value;
    }

    public abstract String displayText();

    @Override
    public String toString()
    {
        return Byte.toString(this.value());
    }
    //endregion

    //region Custom Members
    public abstract OnOff swtch();
    //endregion
}
