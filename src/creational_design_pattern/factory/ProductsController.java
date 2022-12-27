package creational_design_pattern.factory;

import creational_design_pattern.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts(){
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
