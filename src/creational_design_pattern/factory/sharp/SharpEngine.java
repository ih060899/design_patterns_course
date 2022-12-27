package creational_design_pattern.factory.sharp;

import creational_design_pattern.factory.matcha.ViewEngine;

import java.util.Map;

public class SharpEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by sharp";
    }
}
