package _3_creational_patterns._4_abstract_factory_pattern.dark;

import _3_creational_patterns._4_abstract_factory_pattern.Button;

public class DarkButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Dark themed Button");
    }
}