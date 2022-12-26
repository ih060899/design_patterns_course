package structural_design_patterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (String fileName: fileNames) {
            library.add(new EbookProxy(fileName));
        }

        library.openEbook("a");
    }
}
