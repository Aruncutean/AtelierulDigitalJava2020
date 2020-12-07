package L3.visitor;

public class Book  implements Element{

   private int numberOfPages;
   private String name;


    public Book(int numberOfPages, String name) {
        this.numberOfPages = numberOfPages;
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }


    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
