package files.manyobjects.jsonManyObjects;


import com.google.gson.Gson;
import files.emailutils.EmailUnils;

import java.io.FileWriter;
import java.io.IOException;

public class MarshallerExampleManyObjects {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(EmailUnils.getRandomEmails());

        try (FileWriter writer = new FileWriter("./resources/manyObject.json")){
            writer.write(json);
        };
    }
}
