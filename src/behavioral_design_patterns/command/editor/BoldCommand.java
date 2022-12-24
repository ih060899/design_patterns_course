package behavioral_design_patterns.command.editor;

public class BoldCommand implements UndoableCommand {
    private String preContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        preContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
document.setContent(preContent);
    }
}
