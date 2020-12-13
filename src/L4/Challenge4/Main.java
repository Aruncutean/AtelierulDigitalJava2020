package L4.Challenge4;

public class Main {
    public static void main(String[] args) {

        Stage1 stage1=new Stage1("./src/L4/Challenge4/input.txt","./src/L4/Challenge4/output.txt");
        stage1.start();
        Stage2 stage2=new Stage2("./src/L4/Challenge4/input.txt","./src/L4/Challenge4/output1.txt");

        stage2.start(3,5);
    }
}
