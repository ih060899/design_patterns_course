package behavioral_design_patterns.template;

public class TemplateMain {
    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();
    }
}
