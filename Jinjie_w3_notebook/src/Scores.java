import java.util.HashMap;

import javax.xml.transform.Source;

public class Scores {
    private HashMap<String,HashMap<String,Double>> scores = new HashMap<String,HashMap<String,Double>>();
    //录入分数
    public void setScores(String name, String subName, double score){
        if(scores.containsKey(name)){
            scores.get(name).put(subName,score);
        }
        else{
            HashMap<String,Double> temp = new HashMap<>();
            temp.put(subName,score);
            scores.put(name,temp);//??
        }
    }
    public void query(String name){//通过姓名查询该学生的所有成绩
        for(String temp: scores.get(name).keySet()){
            System.out.println("temp是："+temp);
            System.out.println(temp+": "+scores.get(name).get(temp));
        }
    }
    public void queryBySubject(String subName){
        for(String name:scores.keySet()){
            System.out.println("name是"+name);
            for(String temp: scores.get(name).keySet()){
                System.out.println("qBS temp是："+temp);
                if(temp == subName){
                    System.out.println(name+":"+scores.get(name).get(subName));
                }
            }
        }

    }
    public static void main(String[] args) {
        Scores scores = new Scores();
        scores.setScores("Mike", "Physics", 100);
        scores.setScores("David", "Physics", 80);
        scores.setScores("Lucas", "Math", 95);
        scores.setScores("Samuel", "Math", 90);
        scores.setScores("Samuel", "Physics", 80);

        scores.query("Samuel");
        System.out.println("-------");
        scores.queryBySubject("Physics");
    }
}
