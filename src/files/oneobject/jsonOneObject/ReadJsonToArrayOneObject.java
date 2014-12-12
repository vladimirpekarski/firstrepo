package files.oneobject.jsonOneObject;

import files.classemail.Email;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadJsonToArrayOneObject {
    public static void main(String[] args) throws IOException {
        List<Email> emails = new ArrayList<>();
        Email emailToAlex;

        try(FileReader in = new FileReader("./resources/oneObject.json");
            JsonReader reader = Json.createReader(in)) {
            JsonObject object = reader.readObject();
            emailToAlex = new Email(object.getString("toAddress"), object.getString("fromAddress"),
                    object.getString("subject"), object.getString("body"),  object.getString("sendDate"),
                    object.getInt("emailId"));
        }

        emails.add(emailToAlex);

        for(Email email: emails) {
            System.out.println(email);
        }
    }
}
