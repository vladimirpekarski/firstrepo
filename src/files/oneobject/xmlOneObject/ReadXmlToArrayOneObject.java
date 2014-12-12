package files.oneobject.xmlOneObject;

import files.classemail.Email;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.*;

public class ReadXmlToArrayOneObject {

    public static void main(String[] args) {

        List<Email> emal = new ArrayList<Email>();

        try {
            File xmlFile = new File("./resources/emailOneObject.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(xmlFile);

            document.getDocumentElement().normalize();

            Email emailToJohn = new Email(document.getDocumentElement().getElementsByTagName("toAddress").item(0).getTextContent(),
                    document.getDocumentElement().getElementsByTagName("fromAddress").item(0).getTextContent(),
                    document.getDocumentElement().getElementsByTagName("subject").item(0).getTextContent(),
                    document.getDocumentElement().getElementsByTagName("body").item(0).getTextContent(),
                    document.getDocumentElement().getElementsByTagName("sendDate").item(0).getTextContent(),
                    Integer.parseInt(document.getDocumentElement().getAttribute("emailId")));

           emal.add(emailToJohn);

            for (Email value: emal) {
                System.out.println(value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
