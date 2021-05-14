package ru.neoflex.adapter;

public class MicroSD {

    public void insert() {
        System.out.println("Карта памяти успешно инициализирована!");
    }

    public void copyData() {
        System.out.println("Данные скопированы на ПК");
    }

    public void extract() {
        System.out.println("Карта памяти успешно извлечена!");
    }
}