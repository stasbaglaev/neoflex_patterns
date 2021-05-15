package ru.neoflex.task3;

public class Main {

    public static void main(String[] args) {
        DisplayCredentials displayCredentials = DisplayCredentials.getInstance();
        displayCredentials.printCredentials();
        displayCredentials.printCredentials("romanov");
    }
}