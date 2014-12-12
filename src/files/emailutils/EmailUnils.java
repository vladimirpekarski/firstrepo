package files.emailutils;

import files.classemail.Email;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class EmailUnils {
    public static String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String currentDate = formatter.format(date);

        return currentDate;
    }

    public static Email getEmail() {
        Random random = new Random();
        int n = random.nextInt(20) + 1;

        Email randomEmail = new Email(n + "@email.com", "fromMyEmail@mail.com", "Email Number" + n, "Bla Bla Bla " + n,
                getDate(), n);

        return randomEmail;
    }

    public static List<Email> getRandomEmails() {
        List<Email> listOfEmails = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listOfEmails.add(getEmail());
        }

        return listOfEmails;
    }
}

