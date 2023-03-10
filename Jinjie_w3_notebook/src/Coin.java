import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer,String> coinNames = new HashMap<>();
    public Coin(){
        coinNames.put(1, "penny");
        coinNames.put(10, "dime");
        coinNames.put(25, "quarter");
        coinNames.put(50, "half-dolar");
        System.out.println(coinNames);
        for(Integer k : coinNames.keySet()){
            System.out.println("k是："+k);
            System.out.println(coinNames.get(k));
        }
    }
    public String getName(int amount){
        if(coinNames.containsKey(amount)){
            return coinNames.get(amount);
        }
        else{
            return "NOT FOUND";
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);
    }
}
