import java.util.Scanner;

public class w6_2_15 {
    public static void main(String[] args) {
        // char a = 'a';
        String b = "ab1aca ";
        // System.out.println((char)(a+'A'-'a'));
        // System.out.println("abcd\b");
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Character.isLetterOrDigit(a));
        // System.out.println(b.compareTo("a")); //b比c大 1，相等 0，小 -1
        System.out.println(b.charAt(1));//charAt()
        // System.out.println(b.length());//用.length()获得字符串长度（数组的.length是它自己的属性）
        // System.out.println(b.substring(1,2));
        // System.out.println(b.lastIndexOf("a"));//最后一次出现的位置
        System.out.println(b.indexOf("a",2));
        // System.out.println(b.replace("a","i"));
        // System.out.println(b.endsWith("a "));
        
        //w6 hw Q1 读入文本，以空格为分界，打印每组单词长度
        // Scanner num = new Scanner(System.in);
        // System.out.println("请输入一组单词，以空格分界，以.结束：");
        // String s = num.nextLine();
        // String r="";
        // int cnt=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' ' || s.charAt(i)=='.'){
        //         r = r + cnt +" ";
        //         cnt=0;
        //     }
        //     else{
        //         cnt+=1;
        //     }
        // }
        // r = r.trim();
        // System.out.println(r);

        //w6 Q2 输入：一大串信息(END为结束)，判断字段0为$GPRMC开头，字段2状态为"A"，把字段1的UTC转成BJT，输出BJT
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String time = null;
        while(!str.equals("END")){
            String[] splited_str = str.split(",");
            if(!splited_str[0].equals("$GPRMC")){
                str = in.nextLine();
                continue;
            }
            char ch = str.charAt(1);
            int i,result=0;
            // System.out.println(splited_str[2].charAt(0));
            if(splited_str[2].charAt(0)=='A'){
                for(result = str.charAt(1),i=2;ch!='*';i++,ch =str.charAt(i)){
                    ch = str.charAt(i);
                    result ^= (int)ch;
                    // System.out.println("result="+result);
                }
                if(result%65536== Integer.parseInt(str.substring(i+1,i+3),16)){
                    time = splited_str[1];
                }
            }
            str = in.nextLine();
            
        }
        if(time==null){
            System.exit(0);
        }
        String hour = time.substring(0,2);
        String minute = time.substring(2,4);
        String second = time.substring(4,6);
        int BJT_hour = (Integer.parseInt(hour)+8)%24;
        if(BJT_hour<10){
            System.out.println("here");
            System.out.println(0);
        }
        else{
            System.out.println(BJT_hour+":"+minute+":"+second);
        }

    }
}
/*
Java使用Unicode来表示字符，可以表达包括汉字在内的多种文字
逃逸字符：\b, \t, \n换行, \r回车。。。
包裹类型的用处：eg.获得该类型的最大最小值，Integer.MAX_VALUE,Integer.MIN_VALUE
java的字符串变量和数组变量类似，它是字符串的管理者，所有字符串操作都是产生一个新的字符串，而不是对原来的进行修改
eg. x=nextLine()输入的一整行都接收，x=next()只接收到第一个空格前
用==比较字符串，比较的是管理的是不是同一个东西；.equals()比较的是字符串的内容
字符串不能用for-each循环
split(regex,limit) regex是分隔符，limit是分隔的份数
*/