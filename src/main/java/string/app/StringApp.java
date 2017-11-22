package string.app;

import string.builder.StringBuilder;

public class StringApp {
    private StringBuilder builder;
    private String text;

    public void setBuilder(StringBuilder builder) {
        this.builder = builder;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String build(int data) {
        return builder.addString(text+String.valueOf(((float)data/2)));
    }

}
