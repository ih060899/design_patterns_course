package behavioral_design_patterns.mediator;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox(){
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
//        titleTextBox.setContent("");
        System.out.println("Text Box : " + titleTextBox.getContent());
        System.out.println("Saved button : " + saveButton.isEnable());
    }

//    @Override
//    public void changed(UIControl uiControl) {
//        if (uiControl == articlesListBox) {
//            articleSelected();
//        } else if (uiControl == titleTextBox) {
//            titleChanged();
//        }
//    }

    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnable(true);
    }
}
