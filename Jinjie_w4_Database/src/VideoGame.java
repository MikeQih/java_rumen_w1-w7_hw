import javax.print.attribute.standard.NumberOfDocuments;
import javax.xml.transform.Source;

public class VideoGame extends Item {
    private int numberOfPlayers;
    public VideoGame(String title, int playingTime, boolean gotIt, String comment, int number) {
        super(title, playingTime, gotIt, comment);
        numberOfPlayers = number;
    }
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("VideoGame");
        super.print();
    }
    public static void main(String[] args) {
        VideoGame vg = new VideoGame("bbgame", 10, false, null, 0);
        
        System.out.println(vg);
        
    }
}
