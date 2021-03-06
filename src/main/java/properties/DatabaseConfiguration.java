package properties;

import org.flywaydb.core.internal.database.base.Database;

import java.io.*;
import java.util.Properties;

public class DatabaseConfiguration {

    private static final String ENCODING_UTF8 = "UTF-8";
    private Properties config;


    public DatabaseConfiguration() {

        try (InputStream resource = DatabaseConfiguration.class.getResourceAsStream("/db.properties");) {

            load(resource);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public DatabaseConfiguration(File file) {

        try (FileInputStream fileInputStream = new FileInputStream(file);
        ) {

            load(fileInputStream);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    private Properties load(InputStream inputStream) {
        config = new Properties();

        try (
                InputStreamReader reader = new InputStreamReader(inputStream, ENCODING_UTF8);
        ) {
            config.load(reader);
            return config;

        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read properties file from classpath", ioe);
        }

    }

    public static String getEncodingUtf8() {
        return ENCODING_UTF8;
    }

    public Properties getConfig() {
        return config;
    }

    public String getHost() {
        return config.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(config.getProperty("db.port"));
    }

    public String getSchema() {
        return config.getProperty("db.schema");
    }
}
