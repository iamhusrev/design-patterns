package _1_behavioral_pattern._6_command_pattern;

import _1_behavioral_pattern._6_command_pattern.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
