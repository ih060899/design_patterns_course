package behavioral_design_patterns.command;

import behavioral_design_patterns.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
