package com.rafaelromao.javaStatePattern.poc;

public class OffState extends OnOff
{
    OffState()
    {
        super(offValue);
    }

    @Override
    public String displayText()
    {
        return "Desligado";
    }

    @Override
    public OnOff swtch()
    {
        return OnOff.on();
    }
}