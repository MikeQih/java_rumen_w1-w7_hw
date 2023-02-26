import java.util.HashMap;

// package castle;

public class Room {
    public String description;
    private HashMap<String,Room> exits = new HashMap<>();


    public Room(String description) 
    {
        this.description = description;
    }


    public void setExit(String dir, Room room) 
    {
        exits.put(dir, room);
    }

    @Override
    public String toString()
    {
        return description;
    }

    public String getExitDesc(){
        StringBuffer sb = new StringBuffer();
        for(String dir:exits.keySet()){
            sb.append(dir);
            sb.append(' ');
        }
        
        return sb.toString();
    }

    public Room getExit(String direction){
        Room ret = exits.get(direction);
        
        return ret;
    }

}
