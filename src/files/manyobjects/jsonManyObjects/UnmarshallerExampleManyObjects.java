package files.manyobjects.jsonManyObjects;

import files.classemail.Email;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UnmarshallerExampleManyObjects {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        List<Email> emails;

        Type listType = new TypeToken<ArrayList<Email>>() {}.getType();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./resources/manyObject.json"))) {
            emails = gson.fromJson(bufferedReader, listType);
        }

        for (Email email: emails) {
            System.out.println(email);
            System.out.println("-------------------------------");
        }

        System.out.println("Total size: " + emails.size());
    }
}

