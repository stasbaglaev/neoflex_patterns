package ru.neoflex.task2;

public class Main {

    public static void main(String[] args) {
        USB cardReaderMicroSD = new CardReader(new MicroSD());
        USB cardReaderWebCamera = new CardReader(new WebCamera());
        cardReaderMicroSD.disconnectWithUsbCable();
        cardReaderWebCamera.connectWithUsbCable();
    }
}