package behavioralPatterns.command;

import behavioralPatterns.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
