package _1_behavioral_pattern._6_command_pattern.editor;

public class UndoCommand implements Command {
    private final History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.pop().unExecute();
    }
}