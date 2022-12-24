package behavioral_design_patterns.command;

import behavioral_design_patterns.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black And White");
    }
}
