package structural_design_patterns.adapter;

import structural_design_patterns.adapter.avaFilters.Caramel;

public class AdapterMain {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
