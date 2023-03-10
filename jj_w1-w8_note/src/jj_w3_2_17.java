import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class jj_w3_2_17 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        System.out.println(s);
        for(String r:s){
            System.out.println(r);
        }
        System.out.println("------");

        HashMap<String,Integer> k = new HashMap<>();
        k.put("first",1);
        k.put("second",2);
        k.put("first",3);
        System.out.println(k);
        // for(String b: k.keySet()){
        //     System.out.println(b);

        // }
    }
}
/* 
泛型类，容器类两个类型：容器类型，元素类型
eg. private ArrayList<String> notes = new ArrayList<String>(); 
对象数组中的每个元素都是对象的管理者，而非对象本身
Set: 集合就是数学中的集合的概念：所有元素都具有唯一的值，元素在其中没有顺序
在类里只要有一个public String toString(){return ""+i}这么一个方法，println就能toString方法输出string
HashMap所有东西是以一对值放入

HashSet不允许重复元素，无法存储重复值
HashMap不允许重复键，但允许重复值
*/
