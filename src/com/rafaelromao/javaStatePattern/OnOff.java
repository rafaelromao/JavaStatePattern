package com.rafaelromao.javaStatePattern;

public enum OnOff {
    ON {
        public OnOff Switch() {
            return OnOff.OFF;
        }
    },

    OFF {
        public OnOff Switch() {
            return OnOff.ON;
        }
    };

    public abstract OnOff Switch();
}
