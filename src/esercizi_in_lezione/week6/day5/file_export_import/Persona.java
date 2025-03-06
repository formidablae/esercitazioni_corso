package esercizi_in_lezione.week6.day5.file_export_import;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Persona {
    protected String id;
    protected String nome;
    protected String cognome;
    protected String tipo;

    public Persona(String id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.tipo = this.getClass().getSimpleName();
    }

    public String getId() {
        return id;
    }

    public abstract String toCSV();

    public static HashMap<String, Object> fromCSV(String csv) {
        // la riga in csv può avere questo formato
        // 901,Giovanni,Rossi,Docente,
        // 901,Giovanni,Rossi,Docente,1;2;4;4
        String[] parts = csv.split(",");
        if (parts.length != 4 && parts.length != 5) {
            throw new IllegalArgumentException("Invalid CSV format for Persona");
        }
        String id = parts[0].trim();
        String nome = parts[1].trim();
        String cognome = parts[2].trim();
        String tipo = parts[3].trim();
        ArrayList<String> corsi = new ArrayList<>();
        if (parts.length == 5) {
            corsi = new ArrayList<>(List.of(parts[4].trim().split(";")));
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("nome", nome);
        map.put("cognome", cognome);
        map.put("tipo", tipo);
        map.put("corsi", corsi);
        return map;
    }

    public static Persona personaFromCSV(String csv) {
        HashMap<String, Object> map = Persona.fromCSV(csv);
        String id = (String) map.get("id");
        String nome = (String) map.get("nome");
        String cognome = (String) map.get("cognome");
        boolean isStudente = ((String) map.get("tipo")).equals("Studente");
        ArrayList<String> corsiIscritti = (ArrayList<String>) map.get("corsi");
        if (isStudente) {
            Studente s = new Studente(id, nome, cognome);
            for (String corsoId : corsiIscritti) {
                s.iscriviCorso(corsoId);
            }
            return s;
        } else {
            Docente d = new Docente(id, nome, cognome);
            for (String corsoId : corsiIscritti) {
                d.assegnaCorso(corsoId);
            }
            return d;
        }
    }

}

class PersonaAdapter implements JsonDeserializer<Persona> {
    @Override
    public Persona deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String tipo = jsonObject.get("tipo").getAsString();

        // Depending on the "tipo", create either a Studente or Docente object
        if ("Studente".equals(tipo)) {
            return context.deserialize(json, Studente.class);
        } else if ("Docente".equals(tipo)) {
            return context.deserialize(json, Docente.class);
        } else {
            throw new JsonParseException("Unknown type: " + tipo);
        }
    }
}



