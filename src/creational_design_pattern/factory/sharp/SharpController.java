package creational_design_pattern.factory.sharp;

import creational_design_pattern.factory.matcha.Controller;
import creational_design_pattern.factory.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpEngine();
    }
}
