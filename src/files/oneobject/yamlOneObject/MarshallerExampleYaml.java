package files.oneobject.yamlOneObject;

import files.classemail.Email;
import org.yaml.snakeyaml.Yaml;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MarshallerExampleYaml {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String currentDate = formatter.format(date);

        Email emailToAlex = new Email("emailToDmitiy@mail.com", "frommyemail@mail.com", "fourthEmail", "Bla Bla Bla Bla 4",
                currentDate, 4);

        Yaml yaml = new Yaml();
        String yamlString = yaml.dump(emailToAlex);

        try (FileWriter writer = new FileWriter("./resources/oneObject.yaml")){
            writer.write(yamlString);
        };

    }
}
