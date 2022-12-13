package command;

import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;
import command.fx.Button;
import command.fx.Command;

public class CommandMain {
    public static void main(String[] args) {
//        CustomerService service = new CustomerService();
//        Command command = new AddCustomerCommand(service);
//        Button button = new Button(command);
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
