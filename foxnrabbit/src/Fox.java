import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Fox extends Animal implements Cell{
    public Fox(){
        super(20,4);
    }
    
    @Override
    public void draw(Graphics g, int x, int y, int size) {
        int alpha = (int)((1-getAgePercent())*255);
        g.setColor(new Color(0,0,0,alpha));//数字代表颜色，最后一个值是颜色深度，逐渐递减
        g.fillRect(x, y, size, size);
    }

    @Override
    public Animal breed(){
        return super.breed();
    }

    
    @Override
    public Animal getAnimal() {
        return new Fox();
    }

    @Override
    public double getValue() {
        return 0.05;
    }

    @Override
    public Animal feed(ArrayList<Animal> neighbour) {
        Animal ret = null;
        if(Math.random()<0.2){//在一定几率下接收任意一只兔子
            ret = neighbour.get((int)(neighbour.size()*Math.random()));
            longerLife(2);
       }
       return ret;//返回这只兔子
    }
    
}
