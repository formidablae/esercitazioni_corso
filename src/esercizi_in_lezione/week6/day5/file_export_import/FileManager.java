package esercizi_in_lezione.week6.day5.file_export_import;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    private static final Gson GSON = new GsonBuilder()
        .registerTypeAdapter(Persona.class, new PersonaAdapter()) // Register Persona adapter
        .registerTypeAdapter(Corso.class, new CorsoAdapter())     // Register Corso adapter
        .setPrettyPrinting()
        .create();

    public static <T> void salvaDati(String filePath, T data) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            GSON.toJson(data, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> T caricaDati(String filePath, Type typeOfT) throws IOException {
        if (!Files.exists(Paths.get(filePath))) {
            return null;
        }
        try (FileReader reader = new FileReader(filePath)) {
            return GSON.fromJson(reader, typeOfT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
