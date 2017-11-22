package string.builder;

public class StringBuilderAppend implements StringBuilder {
    private String addText;

    public StringBuilderAppend(String addText) {
        this.addText = addText;
    }

    public String addString(String text) {
        return text + ' ' + addText;
    }
}
