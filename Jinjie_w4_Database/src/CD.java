public class CD extends Item{
    private String artist;
    private int numofTracks;

    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title,playingTime,false,comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
        
    }
    public static void main(String[] args) {
        CD cd = new CD("Blue","JW",20,20,"...");
        CD cd1 = new CD("Blue","JW",20,20,"...");

        System.out.println(cd.equals(cd1));
        // cd.print();
        // String s = "专辑信息：" +cd;
        // System.out.println("-----");
        // System.out.println(s);
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        CD cc = (CD)obj; //向下造型
        return artist.equals(cc.artist);
    }
    @Override
    public String toString() {
        return "CD [artist=" + artist + ", numofTracks=" + numofTracks + "]";
    }

}
