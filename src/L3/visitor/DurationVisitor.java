package L3.visitor;


public class DurationVisitor implements Visitor {
    private int totalDuration = 0;

    @Override
    public void visit(Book book) {
        totalDuration += book.getNumberOfPages() * 5;
    }

    @Override
    public void visit(Video video) {

        totalDuration += video.getTime() + video.getTime() / 30 * 5;
    }

    @Override
    public void visit(Audio audio) {
        totalDuration += audio.getTime()+audio.getNumberOfSongs()*0.3;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    @Override
    public String toString() {
        return "The visited elements have a total duration of: "+totalDuration +" min";
    }
}
