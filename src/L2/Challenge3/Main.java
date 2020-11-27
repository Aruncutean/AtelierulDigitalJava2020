package L2.Challenge3;

public class Main {
    public static void main(String[] args) {
       Cat cat=new Cat("Oscar");
        Animal animalCat=  cat;
        cat.play();
        ((Pet)animalCat).play();


    }
}
