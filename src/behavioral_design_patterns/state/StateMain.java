package behavioral_design_patterns.state;

import behavioral_design_patterns.state.abuse.Stopwatch;

public class StateMain {
    public static void main(String[] args) {
//        Canvas canvas = new Canvas();
//        canvas.setCurrentTool(new BrushTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
    }
}
