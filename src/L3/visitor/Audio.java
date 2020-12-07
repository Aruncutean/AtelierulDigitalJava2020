package L3.visitor;

public class Audio implements Element {
    private int time;
    private String name;
    private int numberOfSongs;

    public Audio(int time, String name, int numberOfSongs) {
        this.time = time;
        this.name = name;
        this.numberOfSongs = numberOfSongs;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }
}
