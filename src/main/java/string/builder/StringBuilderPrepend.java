package string.builder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class StringBuilderPrepend implements StringBuilder {

    //@Value("${builder.prepend.text}")
    private String addText;

    public StringBuilderPrepend(String addText) {
        this.addText = addText;
    }

    public String addString(String text) {
        return addText + ' ' + text;
    }
}
