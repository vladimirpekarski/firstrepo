package files.oneobject.jsonOneObject;

import files.classemail.Email;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UnmarshallerExampleJson {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./resources/oneObject.json"))) {
            Email emailToAlex = gson.fromJson(bufferedReader, Email.class);
            System.out.println(emailToAlex);
        }
    }
}
