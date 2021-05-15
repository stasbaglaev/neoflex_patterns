package ru.neoflex.task1.factories;

import ru.neoflex.task1.elements.LinuxButton;
import ru.neoflex.task1.elements.LinuxSelect;
import ru.neoflex.task1.elements.LinuxTextField;
import ru.neoflex.task1.interfaces.Button;
import ru.neoflex.task1.interfaces.Select;
import ru.neoflex.task1.interfaces.TextField;

public class LinuxGUIFactory implements GUIFactory {

    public LinuxGUIFactory() {
        System.out.println("Создание интерфейса для ОС Linux");
    }

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для ОС Linux");
        return new LinuxButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание поля выбора для ОС Linux");
        return new LinuxSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание текстового поля для ОС Linux");
        return new LinuxTextField();
    }
}