package ru.neoflex.task3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserCredentials implements Credentials {
    File file = new File("User credentials.txt");

    @Override
    public String[] readCredentials() {
        ArrayList<String> list = new ArrayList<>();
        int listSize;
        try {
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        listSize = list.size();
        return list.toArray(new String[listSize]);
    }

    @Override
    public String getUserCredentials(String login) {
        String[] userCredentials = readCredentials();
        for (String credentials : userCredentials) {
            if (credentials.startsWith(login + ";")) {
                System.out.println(credentials);
                return credentials;
            }
        }
        return "";
    }
}