package L5.Challenge2;

public class Main {
    public static void main(String[] args) {
      Running r1=new Running();
      Running r2=new Running();
      Boot boot=new Boot();
      
      Pair pair=new Pair(r1,r2);
       new Pair(r1,boot);

    }
}
