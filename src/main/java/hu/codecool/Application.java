package hu.codecool;

import hu.codecool.api.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Application {

    public static void main(String[] args) {
        String config = args[0];

        ApplicationContext context;
        if ("config3".equals(config)) {
            context = new ClassPathXmlApplicationContext("classpath:config3.xml");
        } else {
            context = new AnnotationConfigApplicationContext(
                "hu.codecool.api",
                "hu.codecool.common",
                String.format("hu.codecool.%s", config)
            );
        }
        Printer printer = context.getBean(Printer.class);
        printer.print();

        Set<Integer> a = new ConcurrentSkipListSet<>();
    }

    public static void asd(Printer p) {
        System.out.println("start");
        // get request
        p.print();
        // save db
        System.out.println("end");
    }
}
