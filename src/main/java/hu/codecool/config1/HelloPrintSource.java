package hu.codecool.config1;

import hu.codecool.api.PrintSource;
import org.springframework.stereotype.Component;

@Component
public final class HelloPrintSource implements PrintSource {

    @Override
    public String getSource() {
        return "Hello!";
    }
}
