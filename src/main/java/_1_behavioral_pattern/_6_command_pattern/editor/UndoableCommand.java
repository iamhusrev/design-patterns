package _1_behavioral_pattern._6_command_pattern.editor;

public interface UndoableCommand extends Command {
    void unExecute();
}
