package behavioral_design_patterns.observer;

public class Chart implements Observer{
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: " + dataSource.getValue());
    }
//@Override
//public void update(int value) {
//    System.out.println("Chart got updated : " + value);
//}
}
