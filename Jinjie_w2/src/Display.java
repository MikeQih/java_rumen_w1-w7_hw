// package Jinjie_w2.src;

public class Display {
    private int value=0;
    private int limit=0;
    public Display(int limit){
        this.limit = limit;
    }
    public void setValue(int value_1){
        this.value = value_1;
    }
    public void increase(){
        value++;
        if(value==limit){
            value=0;
        }
    }
    public int getValue(){
        return value;
    }
    public static void main(String[] args) {
        Display d = new Display(24);
        for(int i=0;i<30;i++){
            d.increase();
            System.out.println(d.getValue());
        }   
    }
}
