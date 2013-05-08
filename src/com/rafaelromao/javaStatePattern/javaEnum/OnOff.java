package com.rafaelromao.javaStatePattern.javaEnum;

public enum OnOff {
    ON {
        @Override
        public String displayText() {
            return "Ligado";
        }

        @Override
        public OnOff swtch() {
            return OnOff.OFF;
        }
    },

    OFF {
        @Override
        public String displayText() {
            return "Desligado";
        }

        @Override
        public OnOff swtch() {
            return OnOff.ON;
        }
    };

    public abstract OnOff swtch();
    public abstract String displayText();
}
