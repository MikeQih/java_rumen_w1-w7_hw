import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class w3_hw {
    private ArrayList<String> cityList = new ArrayList<>();
    private HashMap<String,HashMap<String,Integer>> distances = new HashMap<>();
    private static Scanner input = new Scanner(System.in);
    public void input_cityName(){
        //read city name
        while(true){
            System.out.print("请输入城市名：");
            String cityName = input.next();
            if(cityName.equals("###")){
                break;   
            }
            else{
                cityList.add(cityName);
            }
        }

        //read distance between each city
        for(int i=0;i<cityList.size();i++){
            HashMap<String,Integer> cityMap = new HashMap<>();
            for(int j=0;j<cityList.size();j++){
                int distance = input.nextInt();
            
                cityMap.put(cityList.get(j),distance);
                // System.out.println(j+"代表："+cityMap);
            }
            distances.put(cityList.get(i),cityMap);
        }
    }
    public void ccdistance(){
        System.out.print("请输入想知道距离的两个城市:");
        String start_city = input.next();
        String end_city = input.next();
        System.out.println(distances.get(start_city).get(end_city));
    }
    
    public static void main(String[] args) {
        w3_hw dis = new w3_hw();
        dis.input_cityName();
        dis.ccdistance();
        input.close();

    }
}
