package ru.neoflex.adapter;

public class WebCamera implements USB {

    public void insert() {
        System.out.println("Веб камера успешно подключена!");
    }

    public void takePhoto() {
        System.out.println("Веб камера сделала фотографию успешно!");
    }

    public void extract() {
        System.out.println("Веб камера успешно извлечена!");
    }

    @Override
    public void connectWithUsbCable() {
        insert();
        takePhoto();
    }

    @Override
    public void disconnectWithUsbCable() {
        extract();
    }
}