package files.oneobject.csvOneObject;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import files.classemail.Email;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readFromCSVOneObject {
    public static void main(String[] args) throws IOException {
        List<Email> emails = new ArrayList<>();

        try(InputStream os = new FileInputStream("./resources/emailOneObject.csv");
            Reader reader = new InputStreamReader(os, "UTF-8");
            CSVReader csvReader = new CSVReader(reader, ',', CSVWriter.NO_QUOTE_CHARACTER)) {
            String[] dataForOneObject = csvReader.readNext();
            Email emailToAnton = new Email(dataForOneObject[0], dataForOneObject[1], dataForOneObject[2],
                    dataForOneObject[3], dataForOneObject[4], Integer.parseInt(dataForOneObject[5]));

            emails.add(emailToAnton);

            for(Email email: emails) {
                System.out.println(email);
            }
        }
    }
}
