package hu.codecool.config2;

import hu.codecool.api.PrintDestination;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Component
public final class FilePrintDestination implements PrintDestination {

    @Override
    public OutputStream getDestination() {
        try {
            return new FileOutputStream("out.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
