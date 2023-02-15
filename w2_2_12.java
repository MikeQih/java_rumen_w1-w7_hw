import java.util.Scanner;

public class w2_2_12 {
    public static void main(String[] args) {
    
        double a=1.0;
        double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        System.out.println(Math.abs(a-b)<1e-6); //1乘10的负六次方

        int age;
        // System.out.print("请输入你的年龄：");
        // Scanner x = new Scanner(System.in);
        // age=x.nextInt();
        // if(age>30){
        //     System.out.println("珍惜时光");
        // }
        // else if(age>10){
        //     System.out.println("年轻真好");
        // }
        // else{
        //     System.out.println("多吃点肉"); //没有大括号，else和最近的if匹配
        // }

        // switch(age){
        //     case 1:
        //     System.out.println("1岁");
        //     case 2:
        //     System.out.println("2岁");
        //     break;
        //     default:
        //     System.out.println("n岁");
        // }
        
        //w2 hw Q1 时间转换 输入 BJT，输出 UTC(BJT-8)
        int BJT,UTC,h,m;
        System.out.print("请输入北京时间(BJT):");
        Scanner x = new Scanner(System.in);
        BJT=x.nextInt(); //继续想 520 2120
        if(BJT>=0 && BJT<=2359){
            h = BJT/100;
            m = BJT%100;
            if(h-8>0)
                UTC = (h-8)*100+m;
            else if(h-8==0){
                UTC = m;
            }
            else{
                UTC = (24+(h-8))*100+m;
            }
            System.out.println("UTC is:"+ UTC);
        }

        //w2 hw Q2 无线电RS 输入 11-59数字，输出 对应含义
        int num,S,R;
        String s="";
        String r="";
        System.out.println("请输入信号强度与清晰度的数字组合:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if(num>=11 && num<=59){
            S = num%10;
            switch(S){
                case 1:
                    s = "Faint signals, barely perceptible";
                    break;
                case 2:
                    s = "Very weak signals";
                    break;
                case 3:
                    s = "Weak signals";
                    break;
                case 4:
                    s = "Fair signals";
                    break;
                case 5:
                    s = "Fairly good signals";
                    break;
                case 6:
                    s = "Good signals";
                    break;
                case 7:
                    s = "Moderately strong signals";
                    break;
                case 8:
                    s = "Strong signals";
                    break;
                case 9:
                    s = "Extremely strong signals";
                    break;
            }
            R = num/10;
            switch(R){
                case 1:
                    r = "unreadable";
                    break;
                case 2:
                    r = "barely readable, occasional words distinguishable";
                    break;
                case 3:
                    r = "readable with considerable difficulty";
                    break;
                case 4:
                    r = "readable with practically no difficulty";
                    break;
                case 5:
                    r = "perfectly readable";
                    break;
            }
            System.out.println(s+", "+r+".");

        }

        
        
        
        
    }
}
/*
关系运算符优先级比算术运算符低，但是比赋值运算的高
==和!=优先级比其他的低
流程图(UML)
else if很多时的 关于某些特定数字情况的 需要跳转的 级联语句，可以改造成switch语句
*/