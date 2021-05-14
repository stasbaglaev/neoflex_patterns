package ru.neoflex.task2;

public class Main {

    public static void main(String[] args) {
        USB cardReader = new CardReader(new MicroSD());
        USB webCamera = new WebCamera();
        cardReader.disconnectWithUsbCable();
        webCamera.connectWithUsbCable();
    }
}