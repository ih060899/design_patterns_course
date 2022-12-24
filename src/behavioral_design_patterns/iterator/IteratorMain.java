package behavioral_design_patterns.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        BroseHistory history = new BroseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
