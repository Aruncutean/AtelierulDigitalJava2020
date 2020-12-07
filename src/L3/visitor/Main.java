package L3.visitor;

public class Main {
    public static void main(String[] args) {

        Element e1 = new Book(50, "Book Name");
        Element e2 = new Video("Video Name", 120);
        Element e3 = new Audio(180, "Audio Name", 20);

        Element[] elements = new Element[]{e1, e2, e3};
        DurationVisitor durationVisitor = new DurationVisitor();
        NameVisitor nameVisitor = new NameVisitor();
        for (Element e : elements) {
            e.accept(durationVisitor);
            e.accept(nameVisitor);

        }
        System.out.println(durationVisitor.toString());
        System.out.println(nameVisitor.getName());
    }
}
