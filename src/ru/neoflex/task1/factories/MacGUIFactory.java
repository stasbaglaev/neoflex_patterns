package ru.neoflex.task1.factories;

import ru.neoflex.task1.elements.MacButton;
import ru.neoflex.task1.elements.MacSelect;
import ru.neoflex.task1.elements.MacTextField;
import ru.neoflex.task1.interfaces.Button;
import ru.neoflex.task1.interfaces.Select;
import ru.neoflex.task1.interfaces.TextField;

public class MacGUIFactory implements GUIFactory {

    public MacGUIFactory() {
        System.out.println("Создание интерфейса для ОС Mac");
    }

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для ОС Mac");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание поля выбора для ОС Mac");
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание текстового поля для ОС Mac");
        return new MacTextField();
    }
}