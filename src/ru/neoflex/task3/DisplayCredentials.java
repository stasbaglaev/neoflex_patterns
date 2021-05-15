package ru.neoflex.task3;

public class DisplayCredentials {

    private final Credentials userCredentials = new UserCredentialsProxy();//тут происходит подмена на заменитель
    private static DisplayCredentials instance;

    private DisplayCredentials() {
    }

    public static DisplayCredentials getInstance() {
        if (instance == null) {
            instance = new DisplayCredentials();
        }
        return instance;
    }

    public void printCredentials() {
        String[] credentials = userCredentials.readCredentials();
        String[] tmpArr;
        System.out.println("Логин\tПароль");
        for (String userCr : credentials) {
            tmpArr = userCr.split(";");
            System.out.printf("%s\t%s%n", tmpArr[0], tmpArr[1]);
        }
        System.out.println();
    }

    public void printCredentials(String login) {
        userCredentials.getUserCredentials(login);
    }
}