package files.manyobjects.yamlManyObject;

import files.emailutils.EmailUnils;
import org.yaml.snakeyaml.Yaml;

import java.io.FileWriter;
import java.io.IOException;

public class MarshallerExampleMayObjects {
    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        String yamlString = yaml.dump(EmailUnils.getRandomEmails());

        try (FileWriter writer = new FileWriter("./resources/manyObject.yaml")){
            writer.write(yamlString);
        };
    }
}
