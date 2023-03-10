import java.util.ArrayList;
// package Jinjie_w4_Database;

public class Database {
    // private ArrayList<CD> listCD = new ArrayList<>();
    private ArrayList<Item> listItem = new ArrayList<>();

    public void add(Item item){
        listItem.add(item);
    }
    public void list(){
        for(Item item : listItem){
            item.print();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("Magic Man", "JacksonWang", 20, 180, "nb"));
        db.add(new VideoGame("双人成行", 20, false, "...", 2));
        db.add(new w4_hw_MP3("半岛铁盒", 20, false, "...", 50));

        db.list();

    }
    
}
