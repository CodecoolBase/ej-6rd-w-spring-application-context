package hu.codecool.api;

import java.io.OutputStream;

public interface PrintDestination {

    OutputStream getDestination();
}
