package _3_creational_patterns._4_abstract_factory_pattern.light;

import _3_creational_patterns._4_abstract_factory_pattern.Button;

public class LightButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Light themed Button");
    }
}