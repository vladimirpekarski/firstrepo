package files.manyobjects.yamlManyObject;

import files.classemail.Email;
import org.yaml.snakeyaml.Yaml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnmarshallerExampleManyObjects {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./resources/manyObject.yaml"))) {

            Yaml yaml = new Yaml();
            List<Email> emails = (ArrayList<Email>)yaml.load (bufferedReader);

            for (Email email: emails) {
                System.out.println(email);
            }

            System.out.println("Total size: " + emails.size());
        }
    }
}
