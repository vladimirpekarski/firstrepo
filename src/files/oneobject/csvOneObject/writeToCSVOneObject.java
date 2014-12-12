package files.oneobject.csvOneObject;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.*;

public class writeToCSVOneObject {
    public static void main(String[] args) throws IOException {
        String[] oneObject = new String[] {"emailToAnton@mail.com", "frommyemail@email.com", "Third Letter", "Bla Bla 3",
                "2014/12/10 16:08:04", "3"};
        try(OutputStream os = new FileOutputStream("./resources/emailOneObject.csv");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        CSVWriter CSVwriter = new CSVWriter(writer, ',', CSVWriter.NO_QUOTE_CHARACTER))  {
            CSVwriter.writeNext(oneObject);
        }
    }
}
