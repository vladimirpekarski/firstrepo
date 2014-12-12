package files.oneobject.yamlOneObject;

import files.classemail.Email;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnmarshallerExampleYaml {
    public static void main(String[] args) throws IOException {
        List<Email> emails = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./resources/oneObject.yaml"))) {
            Constructor constructor = new Constructor(Email.class);
            Yaml yaml = new Yaml(constructor);

            Email emailToDmitriy = (Email)yaml.load(bufferedReader);
            emails.add(emailToDmitriy);

            for (Email email: emails) {
                System.out.println(email);
            }
        }
    }
}
