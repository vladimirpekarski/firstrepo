package files.oneobject.propertiesOnePbject;

import files.classemail.Email;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReadPropertiesToArrayOneObject {
    public static void main(String[] args) throws IOException{
        InputStream in = new FileInputStream("./resources/emailOneObject.properties");
        Properties properties = new Properties();
        properties.load(in);
        in.close();

        Email emailToElena = new Email(properties.getProperty("toAddress"), properties.getProperty("fromAddress"),
                properties.getProperty("subject"), properties.getProperty("body"), properties.getProperty("sendDate"),
                Integer.parseInt(properties.getProperty("emailId")));

        List<Email> emails = new ArrayList<>();
        emails.add(emailToElena);

        for (Email email: emails) {
            System.out.println(email);
        }
    }
}
