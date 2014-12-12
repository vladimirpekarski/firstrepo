package files.oneobject.jsonOneObject;

import files.classemail.Email;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MarshallerExampleJson {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String currentDate = formatter.format(date);

        Email emailToAlex = new Email("alex@somemeil.com", "frommyemail@someemail.com", "Second email", "Bla Bla Bla Bla", currentDate, 2);

        Gson gson = new Gson();
        String json = gson.toJson(emailToAlex);

        try (FileWriter writer = new FileWriter("./resources/oneObject.json")){
            writer.write(json);
        };

    }
}
