package files.oneobject.propertiesOnePbject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


public class WritePropertiesFileOneObject {
    public static void main(String[] args) throws IOException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String currentDate = formatter.format(date);

        Properties properties = new Properties();
        properties.setProperty("toAddress", "emailToElena@mail.com");
        properties.setProperty("fromAddress", "frommyemail@mail.com");
        properties.setProperty("subject", "Fifth Email");
        properties.setProperty("body", "Bla Bla Bla Bla 5");
        properties.setProperty("emailId", "5");
        properties.setProperty("sendDate", currentDate);

        OutputStream os = new FileOutputStream("./resources/emailOneObject.properties");
        properties.store(os, "Email to Elena");
        os.close();
    }
}


