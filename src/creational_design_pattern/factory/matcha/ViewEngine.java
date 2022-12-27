package creational_design_pattern.factory.matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
