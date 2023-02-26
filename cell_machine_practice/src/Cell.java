import java.awt.Graphics;
public class Cell {
    private boolean alive = false;
    public void reborns(){
        alive = true;
    }
    public void isDie(){
        alive = false;
    }
    public boolean isAlive(){
        return alive;
    }

    public void draw(Graphics g,int x, int y, int size){
        g.drawRect(x, y, size, size);
        if(alive){
            g.fillRect(x, y, size, size);
        }
    }
    
}



