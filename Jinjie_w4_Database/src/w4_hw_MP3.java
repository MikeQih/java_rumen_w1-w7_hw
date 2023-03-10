public class w4_hw_MP3 extends Item{
    private int weight;
    public w4_hw_MP3(String title, int playingTime, boolean gotIt, String comment, int number) {
        super(title, playingTime, gotIt, comment);
        weight = number;
    }
    public static void main(String[] args) {
        w4_hw_MP3 mp3 = new w4_hw_MP3("半岛铁盒", 0, false, null,50);
        System.out.println(mp3);
        mp3.print();
    }
    @Override
    public void print() {
        System.out.print("专辑名: \n");
        // TODO Auto-generated method stub
        super.print();
    }
    
}
