package _3_creational_patterns._4_abstract_factory_pattern.light;


import _3_creational_patterns._4_abstract_factory_pattern.Button;
import _3_creational_patterns._4_abstract_factory_pattern.Checkbox;
import _3_creational_patterns._4_abstract_factory_pattern.UIFactory;


public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}