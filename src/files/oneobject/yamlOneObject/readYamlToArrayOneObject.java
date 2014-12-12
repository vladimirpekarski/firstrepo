package files.oneobject.yamlOneObject;

import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;


public class readYamlToArrayOneObject {
    public static void main(String[] args) throws IOException {
        try (FileReader in = new FileReader("./resources/oneObject.yaml")) {
            Yaml yaml = new Yaml();

            Map<String, Object> map = (Map<String, Object>)yaml.load(in);
            for (String key : map.keySet()) {
                System.out.print(key + ": ");
                System.out.println(map.get(key));
            }
        }
    }
}
