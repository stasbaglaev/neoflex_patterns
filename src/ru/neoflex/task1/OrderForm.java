package ru.neoflex.task1;

import ru.neoflex.task1.factories.GUIFactory;
import ru.neoflex.task1.interfaces.Button;
import ru.neoflex.task1.interfaces.Select;
import ru.neoflex.task1.interfaces.TextField;

public class OrderForm {
    private final TextField customerNameTextField;
    private final Select colorTypeSelect;
    private final Button orderButton;

    public OrderForm(GUIFactory factory) {
        System.out.println("Создается форма заказа");
        customerNameTextField = factory.createTextField();
        colorTypeSelect = factory.createSelect();
        orderButton = factory.createButton();
    }
}