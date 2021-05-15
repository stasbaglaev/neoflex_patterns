package ru.neoflex.task1.factories;

import ru.neoflex.task1.interfaces.Button;
import ru.neoflex.task1.interfaces.Select;
import ru.neoflex.task1.interfaces.TextField;

public interface GUIFactory {
    Button createButton();

    Select createSelect();

    TextField createTextField();
}