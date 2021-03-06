package com.rafaelromao.javaStatePattern.javaEnum.test;

import com.rafaelromao.javaStatePattern.javaEnum.OnOff;
import org.junit.Assert;
import org.junit.Test;

public class OnOffTest {
    @Test
    public void testOnIsOn() throws Exception
    {
        OnOff on1 = OnOff.ON;
        OnOff on2 = OnOff.ON;
        Assert.assertSame(on1, on2);
    }

    @Test
    public void testOffIsOff()
    {
        OnOff off1 = OnOff.OFF;
        OnOff off2 = OnOff.OFF;
        Assert.assertSame(off1, off2);
    }
    @Test
    public void testOnIsNotOff()
    {
        OnOff on = OnOff.ON;
        OnOff off = OnOff.OFF;
        Assert.assertNotSame(on, off);
    }

    @Test
    public void testOnOffSwitches()
    {
        OnOff on = OnOff.ON;
        OnOff off = OnOff.OFF;

        OnOff onSwitched = on.swtch();
        OnOff offSwitched = off.swtch();

        Assert.assertSame(on, offSwitched);
        Assert.assertSame(off, onSwitched);
    }

    @Test
    public void testSwitchStatement()
    {
        OnOff on = OnOff.ON;
        switch (on)
        {
            case ON:
                break;
            default:
                Assert.fail();
                break;
        }
        OnOff off = OnOff.OFF;
        switch (off)
        {
            case OFF:
                break;
            default:
                Assert.fail();
                break;
        }
    }

    @Test
    public void testStates()
    {
        OnOff[] states = OnOff.values();
        Assert.assertNotNull(states);

        OnOff statesOn = states[0];
        Assert.assertSame(statesOn, OnOff.ON);

        OnOff statesOff = states[1];
        Assert.assertSame(statesOff, OnOff.OFF);
    }
    @Test
    public void testDisplayText()
    {
        String onDisplayText = OnOff.ON.displayText();
        String offDisplayText = OnOff.OFF.displayText();
        Assert.assertSame("Ligado", onDisplayText);
        Assert.assertSame("Desligado", offDisplayText);
    }
}
