package observer;

public class SpreadSheet implements Observer{
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spread Sheet got notified: " + dataSource.getValue());
    }
//@Override
//public void update(int value) {
//    System.out.println("Spread Sheet got notified : " + value);
//}
}
