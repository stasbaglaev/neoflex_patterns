package ru.neoflex.adapter;

public class CardReader implements USB {

    private MicroSD microSD;

    public CardReader(MicroSD microSD) {
        setMicroSD(microSD);
    }

    @Override
    public void connectWithUsbCable() {
        getMicroSD().insert();
        getMicroSD().copyData();
    }

    @Override
    public void disconnectWithUsbCable() {
        getMicroSD().extract();
        extractCardRider();
    }

    public MicroSD getMicroSD() {
        return microSD;
    }

    public void setMicroSD(MicroSD microSD) {
        this.microSD = microSD;
    }

    public void extractCardRider() {
        System.out.println("Кардридер успешно извлечен!");
    }
}