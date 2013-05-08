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
/*    [Test]
    public void TestExplicitCastFromValue()
    {
        var on = OnOff.On;
        var onValue = OnOff.On.Value;
        var onValueCastToOnOff = (OnOff)onValue;
        Assert.AreEqual(on, onValueCastToOnOff);
    }
    [Test]
    public void TestImplicitCastFromValue()
    {
        var on = OnOff.On;
        var onValue = OnOff.On.Value;
        OnOff onValueCastToOnOff = onValue;
        Assert.AreEqual(on, onValueCastToOnOff);
    }
    [Test]
    public void TestExplicitCastToValue()
    {
        var on = OnOff.On;
        var onValue = OnOff.On.Value;
        var onCastToValue = (OnOff.Values)on;
        Assert.AreEqual(onValue, onCastToValue);
    }
    [Test]
    public void TestImplicitCastToValue()
    {
        var on = OnOff.On;
        var onValue = OnOff.On.Value;
        OnOff.Values onCastToValue = on;
        Assert.AreEqual(onValue, onCastToValue);
    }
    [Test]
    public void TestExplicitCastFromByte()
    {
        var on = OnOff.On;
        var onValueAsByte = (byte)OnOff.On.Value;
        var onValueAsByteCastToOnOff = (OnOff)onValueAsByte;
        Assert.AreEqual(on, onValueAsByteCastToOnOff);
    }
    [Test]
    public void TestImplicitCastFromByte()
    {
        var on = OnOff.On;
        var onValueAsByte = (byte)OnOff.On.Value;
        OnOff onValueAsByteCastToOnOff = onValueAsByte;
        Assert.AreEqual(on, onValueAsByteCastToOnOff);
    }
    [Test]
    public void TestExplicitCastToByte()
    {
        var on = OnOff.On;
        var onValueAsByte = (byte)OnOff.On.Value;
        var onCastToByte = (byte)on;
        Assert.AreEqual(onValueAsByte, onCastToByte);
    }
    [Test]
    public void TestImplicitCastToByte()
    {
        var on = OnOff.On;
        var onValueAsByte = (byte)OnOff.On.Value;
        byte onCastToByte = on;
        Assert.AreEqual(onValueAsByte, onCastToByte);
    }
    [Test]
    public void TestToString()
    {
        var onValueAsString = OnOff.Values.On.ToString();
        var onStateAsString = OnOff.On.ToString();
        Assert.AreEqual(onValueAsString, onStateAsString);

        var offValueAsString = OnOff.Values.Off.ToString();
        var offStateAsString = OnOff.Off.ToString();
        Assert.AreEqual(offValueAsString, offStateAsString);
    }
    [Test]
    public void TestDisplayText()
    {
        var onDisplayText = OnOff.On.DisplayText;
        var offDisplayText = OnOff.Off.DisplayText;
        Assert.AreEqual("Ligado", onDisplayText);
        Assert.AreEqual("Desligado", offDisplayText);
    }
    */
}
