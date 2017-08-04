package hu.codecool.common;

import hu.codecool.api.PrintDestination;
import hu.codecool.api.PrintSource;
import hu.codecool.api.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class DefaultPrinter implements Printer {

    @Autowired
    private PrintSource source;

    @Autowired
    private PrintDestination destination;

    @Override
    public void print() {
        new PrintStream(destination.getDestination()).print(source.getSource());
    }

    public void setSource(PrintSource source) {
        this.source = source;
    }

    public void setDestination(PrintDestination destination) {
        this.destination = destination;
    }
}
