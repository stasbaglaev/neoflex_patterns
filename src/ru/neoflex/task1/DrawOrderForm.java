package ru.neoflex.task1;

import ru.neoflex.task1.factories.GUIFactory;
import ru.neoflex.task1.factories.LinuxGUIFactory;
import ru.neoflex.task1.factories.MacGUIFactory;
import ru.neoflex.task1.factories.WindowsGUIFactory;

public class DrawOrderForm {

    public void drawOrderForm(String osName) {

        OrderForm orderForm;
        GUIFactory guiFactory;

        switch (osName) {
            case "win":
                guiFactory = new WindowsGUIFactory();
                orderForm = new OrderForm(guiFactory);
                break;
            case "mac":
                guiFactory = new MacGUIFactory();
                orderForm = new OrderForm(guiFactory);
                break;
            case "linux":
                guiFactory = new LinuxGUIFactory();
                orderForm = new OrderForm(guiFactory);
                break;
            default:
                System.out.println("Unknown OS");
                break;
        }
    }
}