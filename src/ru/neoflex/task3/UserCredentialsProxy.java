package ru.neoflex.task3;

public class UserCredentialsProxy implements Credentials {

    private final Credentials userCredentials = new UserCredentials();
    private String[] credentialsCache = null;

    @Override
    public String[] readCredentials() {
        if (credentialsCache == null) {
            credentialsCache = userCredentials.readCredentials();
        }
        return credentialsCache;
    }
}