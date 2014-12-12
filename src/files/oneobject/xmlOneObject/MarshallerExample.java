package files.oneobject.xmlOneObject;

import files.classemail.Email;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MarshallerExample {
    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String currentDate = formatter.format(date);

        Email emailToJohn = new Email("john@somemeil.com", "frommyemail@someemail.com", "First email", "Bla Bla Bla Bla", currentDate, 1);

        try {
            File file = new File("./resources/emailOneObject.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Email.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(emailToJohn, file);
            jaxbMarshaller.marshal(emailToJohn, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
