import java.awt.Color;
import java.awt.Graphics;

public class Rabbit extends Animal implements Cell{
    public Rabbit(){
        super(10,2);
    }
    
    @Override
    public Animal breed(){
        return super.breed();
    }
    
    @Override
    public Animal getAnimal() {
        return new Rabbit();
    }

    @Override
    public double getValue() {
        return 0.12;
    }

    @Override
    public void draw(Graphics g, int x, int y, int size) {
        int alpha = (int)((1-getAgePercent())*255);
        g.setColor(new Color(255,0,0,alpha));//数字代表颜色，最后一个值是颜色深度，逐渐递减
        g.fillRect(x, y, size, size);
    }
}
