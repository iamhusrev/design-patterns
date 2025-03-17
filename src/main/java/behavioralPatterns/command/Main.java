package behavioralPatterns.command;

import behavioralPatterns.command.fx.Button;

public class Main {

    public static void main(String[] args) {

        // Command Pattern
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();


        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();


        // Undoable Command Pattern
    }
}
