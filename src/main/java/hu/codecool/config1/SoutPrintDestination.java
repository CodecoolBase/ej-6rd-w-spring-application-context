package hu.codecool.config1;

import hu.codecool.api.PrintDestination;
import org.springframework.stereotype.Component;

import java.io.OutputStream;

@Component
public final class SoutPrintDestination implements PrintDestination {

    @Override
    public OutputStream getDestination() {
        return System.out;
    }
}
