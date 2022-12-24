package behavioral_design_patterns.template;

public class GenerateReportTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Generate Record");
    }
}
