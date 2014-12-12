package files.oneobject.xmlOneObject;

import files.classemail.Email;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnmarshallerExample {
    public static void main(String[] args) {
        File file = new File("./resources/emailOneObject.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Email.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Email emailToJohn = (Email) jaxbUnmarshaller.unmarshal(file);
            System.out.println(emailToJohn);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
