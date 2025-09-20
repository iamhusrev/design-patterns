package _3_creational_patterns._4_abstract_factory_pattern.dark;

import _3_creational_patterns._4_abstract_factory_pattern.Checkbox;

public class DarkCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Dark themed Checkbox");
    }
}