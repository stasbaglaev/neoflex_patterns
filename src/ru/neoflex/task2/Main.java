package ru.neoflex.task2;

public class Main {
    private static final MicroSD microSD = new MicroSD();
    private static final WebCamera webCamera = new WebCamera();
    private static USB cardReader;

    public static void main(String[] args) {
        extractMicroSD();
        insertWebCamera();
    }

    private static void extractMicroSD() {
        cardReader = new CardReader(microSD);
        cardReader.disconnectWithUsbCable();
    }

    private static void extractWebCamera() {
        cardReader = new CardReader(webCamera);
        cardReader.disconnectWithUsbCable();
    }

    private static void insertMicroSD() {
        cardReader = new CardReader(microSD);
        cardReader.connectWithUsbCable();
    }

    private static void insertWebCamera() {
        cardReader = new CardReader(webCamera);
        cardReader.connectWithUsbCable();
    }
}