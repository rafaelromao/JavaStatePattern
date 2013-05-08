package com.rafaelromao.javaStatePattern.javaEnum.test;

import com.rafaelromao.javaStatePattern.poc.OnOff;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OnOffTest {
    @Test
    public void testOnIsOn() throws Exception
    {
        OnOff on1 = OnOff.on();
        OnOff on2 = OnOff.on();
        Assert.assertSame(on1, on2);
    }

    @Test
    public void testOffIsOff()
    {
        OnOff off1 = OnOff.off();
        OnOff off2 = OnOff.off();
        Assert.assertSame(off1, off2);
    }
    @Test
    public void testOnIsNotOff()
    {
        OnOff on = OnOff.on();
        OnOff off = OnOff.off();
        Assert.assertNotSame(on, off);
    }

    @Test
    public void testOnOffSwitches()
    {
        OnOff on = OnOff.on();
        OnOff off = OnOff.off();

        OnOff onSwitched = on.swtch();
        OnOff offSwitched = off.swtch();

        Assert.assertSame(on, offSwitched);
        Assert.assertSame(off, onSwitched);
    }

    @Test
    public void testSwitchStatement()
    {
        OnOff on = OnOff.on();
        switch (on.value())
        {
            case OnOff.onValue:
                break;
            default:
                Assert.fail();
                break;
        }
        OnOff off = OnOff.off();
        switch (off.value())
        {
            case OnOff.offValue:
                break;
            default:
                Assert.fail();
                break;
        }
    }

    @Test
    public void testStates()
    {
        List<OnOff> states = OnOff.states();
        Assert.assertNotNull(states);

        OnOff statesOn = states.get(0);
        Assert.assertSame(statesOn, OnOff.on());

        OnOff statesOff = states.get(1);
        Assert.assertSame(statesOff, OnOff.off());
    }
    @Test
    public void testDisplayText()
    {
        String onDisplayText = OnOff.on().displayText();
        String offDisplayText = OnOff.off().displayText();
        Assert.assertSame("Ligado", onDisplayText);
        Assert.assertSame("Desligado", offDisplayText);
    }
}
