package hu.codecool.config3;

import hu.codecool.api.PrintSource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public final class HttpGetPrintSource implements PrintSource {

    @Override
    public String getSource() {
        try {
            URL url = new URL("http://jsonplaceholder.typicode.com/users/1");
            URLConnection connection = url.openConnection();
            connection.connect();
            InputStream is = connection.getInputStream();
            byte[] buffer = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = is.read(buffer);
                if (read <= 0) {
                    break;
                }
                sb.append(new String(buffer, 0, read));
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
