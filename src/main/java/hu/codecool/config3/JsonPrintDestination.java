package hu.codecool.config3;

import hu.codecool.api.PrintDestination;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class JsonPrintDestination implements PrintDestination {

    @Override
    public OutputStream getDestination() {
        try {
            return new FileOutputStream("out.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
