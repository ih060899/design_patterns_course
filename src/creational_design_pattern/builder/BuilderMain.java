package creational_design_pattern.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));
        presentation.addSlide(new Slide("Slide 3"));
        presentation.addSlide(new Slide("Slide 4"));
        PdfDocumentBuilder builder = new PdfDocumentBuilder();
        MovieBuilder builder1 = new MovieBuilder();

        presentation.export(builder);

        PdfDocument pdf =  builder.getPdfDocument();
        Movie movie = builder1.getMovie();
    }
}
