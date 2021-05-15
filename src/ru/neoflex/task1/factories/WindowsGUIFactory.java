package ru.neoflex.task1.factories;

import ru.neoflex.task1.elements.WindowsButton;
import ru.neoflex.task1.elements.WindowsSelect;
import ru.neoflex.task1.elements.WindowsTextField;
import ru.neoflex.task1.interfaces.Button;
import ru.neoflex.task1.interfaces.Select;
import ru.neoflex.task1.interfaces.TextField;

public class WindowsGUIFactory implements GUIFactory {

    public WindowsGUIFactory() {
        System.out.println("Идет создание GUI для ОС Windows");
    }

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для ОС Windows");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание поля выбора для ОС Windows");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание текстового поля для ОС Windows");
        return new WindowsTextField();
    }
}