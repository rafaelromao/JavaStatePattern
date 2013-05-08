package com.rafaelromao.javaStatePattern.poc;

public class OnState extends OnOff
{
    OnState()
    {
        super(onValue);
    }

    @Override
    public String displayText()
    {
        return "Ligado";
    }

    @Override
    public OnOff swtch()
    {
        return OnOff.off();
    }
}
