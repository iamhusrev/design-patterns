package _3_creational_patterns._5_builder_pattern;

import _3_creational_patterns._5_builder_pattern.car_example.Car;
import _3_creational_patterns._5_builder_pattern.car_example.SUVBuilder;
import _3_creational_patterns._5_builder_pattern.car_example.SportsCarBuilder;
import _3_creational_patterns._5_builder_pattern.presentation_example.Presentation;
import _3_creational_patterns._5_builder_pattern.presentation_example.Slide;
import _3_creational_patterns._5_builder_pattern.presentation_example.movie.MovieBuilder;

public class BuilderDemo {
    public static void main(String[] args) {

        var presentation = new Presentation();
        presentation.addSlide(new Slide("Welcome to the Presentation"));
        presentation.addSlide(new Slide("Agenda"));
        presentation.addSlide(new Slide("Conclusion"));

        var builder = new MovieBuilder();
        presentation.export(builder);

        var movie = builder.getMovie();


        ///  Car builder example

        Car sportsCar = new SportsCarBuilder().color("blue").build();
        System.out.println(sportsCar);

        Car suv = new SUVBuilder().engine("V6").build();
        System.out.println(suv);
    }
}