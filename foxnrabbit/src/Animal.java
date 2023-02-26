import java.util.ArrayList;

import javax.swing.GroupLayout.Alignment;

public abstract class Animal {
    private int age;
    private int ageLimit;
    private int breedableAge;
    private boolean alive=true;

    public Animal(int ageLimit, int breedableAge){
        this.ageLimit = ageLimit;
        this.breedableAge = breedableAge;
    }

    public boolean isAlive(){
        return alive;
    }
    public void grow(){
        age++;
        if(age>=ageLimit){
            die();
        }
    }
    public void die(){
        alive=false;

    }
    public int getAge(){
        return age;
    }
    protected double getAgePercent(){
        return (double)age/ageLimit;
    }

    public Location move(Location[] freeAdj){
        Location ret = null;
        if(freeAdj.length>0 && Math.random()<0.02){
            ret = freeAdj[(int)(Math.random()*freeAdj.length)];
        }
        return ret;
    }
    public Animal feed(ArrayList<Animal> neighbour){
        return null;
    }
    protected void longerLife(int inc){
        ageLimit+=inc;
    }

    protected boolean isBreedable(){
        return age>=ageLimit;
    }
    public abstract Animal getAnimal();
    public abstract double getValue();

    public Animal breed(){
        Animal ret = null;
        if(isBreedable() && Math.random()<getValue()){
            ret = getAnimal();
        }
        return ret;
    }
    
}
