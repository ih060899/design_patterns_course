package behavioral_design_patterns.command;

import behavioral_design_patterns.command.editor.BoldCommand;
import behavioral_design_patterns.command.editor.History;
import behavioral_design_patterns.command.editor.HtmlDocument;
import behavioral_design_patterns.command.editor.UndoCommand;

public class CommandMain {
    public static void main(String[] args) {
//        CustomerService service = new CustomerService();
//        Command behavioral_design_patterns.command = new AddCustomerCommand(service);
//        Button button = new Button(behavioral_design_patterns.command);
//        button.click();

//        CompositeCommand compositeCommand = new CompositeCommand();
//        compositeCommand.addCommand(new ResizeCommand());
//        compositeCommand.addCommand(new BlackAndWhiteCommand());
//        compositeCommand.execute();

        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");
        BoldCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
