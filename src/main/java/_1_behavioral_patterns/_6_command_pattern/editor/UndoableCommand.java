package _1_behavioral_patterns._6_command_pattern.editor;

public interface UndoableCommand extends Command {
    void unExecute();
}
