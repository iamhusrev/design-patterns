package _3_creational_patterns._4_abstract_factory_pattern;

import _3_creational_patterns._4_abstract_factory_pattern.dark.DarkThemeFactory;
import _3_creational_patterns._4_abstract_factory_pattern.light.LightThemeFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UIFactory factory = new DarkThemeFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

        UIFactory lightFactory = new LightThemeFactory();
        lightFactory.createButton().paint();
    }
}