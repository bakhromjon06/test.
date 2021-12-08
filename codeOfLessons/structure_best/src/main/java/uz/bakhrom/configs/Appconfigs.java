package uz.bakhrom.configs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Bakhromjon Tue, 8:35 PM 12/7/2021
 */
public class Appconfigs {
    private static Properties properties = new Properties();

    public static void init() {
        load();
    }

    private static void load() {
        try {
            properties.load(new FileReader("src/main/resources/app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
