package hu.codecool.config2;

import hu.codecool.api.PrintSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

@Component
public final class ScannerPrintSource implements PrintSource {

    @Override
    public String getSource() {
        System.out.println("Write something and press <Enter>!");

        return new Scanner(System.in).nextLine();
    }
}
