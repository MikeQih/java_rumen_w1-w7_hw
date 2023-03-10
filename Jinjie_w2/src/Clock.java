// import java.time.Clock;

// package Jinjie_w2.src;
public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private Display second = new Display(60);

    public Clock(int h,int m,int s){
        if(h>=0&&h<=23 && m>=0&&m<=59 &&s>=0&&s<=59){
            hour.setValue(h);
            minute.setValue(m);
            second.setValue(s);
        }
        else{
            System.out.println("Error!");
        }

    }
    public void tick(){
        second.increase();
        if(second.getValue()==0){
            minute.increase();
            if(minute.getValue()==0){
                hour.increase();
            }
        }
        
    }
    public String toString(){
        return String.format("%02d:%02d:%02d\n",hour.getValue(),minute.getValue(),second.getValue());
    }
    // public void start(){
    //     while(true){
    //         second.increase();
    //         if(second.getValue()==0){
    //             minute.increase();
    //             if(minute.getValue()==0){
    //                 hour.increase();
    //             }
    //         }

    //         System.out.printf("%02d:%02d:%02d\n",hour.getValue(),minute.getValue(),second.getValue());
    //     }
    // }
}
