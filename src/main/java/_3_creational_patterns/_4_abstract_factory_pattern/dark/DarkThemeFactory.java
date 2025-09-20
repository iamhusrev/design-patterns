package _3_creational_patterns._4_abstract_factory_pattern.dark;

import _3_creational_patterns._4_abstract_factory_pattern.Button;
import _3_creational_patterns._4_abstract_factory_pattern.Checkbox;
import _3_creational_patterns._4_abstract_factory_pattern.UIFactory;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}