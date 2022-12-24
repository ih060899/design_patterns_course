package behavioral_design_patterns.command;

import behavioral_design_patterns.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
