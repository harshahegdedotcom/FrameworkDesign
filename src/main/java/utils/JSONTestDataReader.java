package utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class JSONTestDataReader {
    private static JsonObject data;

    public static void loadData(String env) {
        try {
            JsonParser parser = new JsonParser();
            Object obj = parser.parse(new FileReader(".//src//test//resources//testdata/" + env + "//userData.json"));
            data = (JsonObject) obj;
        } catch (Exception e) {
            throw new RuntimeException("Error loading test data for environment: " + env);
        }
    }

    public static String get(String key) {
        return data.get(key).toString();
    }
}
