import java.util.Scanner;

public class w1_2_12 {//week1
    public static void main(String[] args) {
        int u = 32;
        int v = 26;
        while(v!=0){
            int temp = u%v;
            u = v;
            v=temp;
        }
        System.out.println(u); //最大公约数u
        // Scanner in  = new Scanner(System.in);
        // System.out.println("echo: "+in.nextLine());
        int price;
        int amount; //常量 一直不变
        // System.out.print("请输入票面：");
        // amount = in.nextInt();
        // System.out.print("请输入金额：");
        // price = in.nextInt();
        // System.out.println(2+3+"=2+3="+(2+3));
        // System.out.println(amount+"-"+price+"="+(amount-price));

        int foot;//英尺
        // int inch;//英寸
        double inch; //double转int需要强制类型转换 int转double自动
        Scanner x = new Scanner(System.in);
        foot = x.nextInt();
        inch = x.nextDouble();
        System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");

        //week1 hw 温度转换：输入 华氏温度-> 输出 摄氏温度
        int F;
        int C;
        Scanner input = new Scanner(System.in); //100
        F = input.nextInt();

        C = (int)((F-32)/(9/5.0));
        System.out.println(C); //37


    }
    /*
    解释：借助一个程序，那个程序能试图理解你写的程序，然后按照你的要求执行 ？？没大懂，不是先编译再解释？为什么运行的是编译的
    编译（更快一点）：借助一个程序，就像个翻译，把你写的程序翻译成计算机真正能读懂的语言--机器语言--写的程序，然后这个机器语言写的程序就能直接执行了
    
    变量需要名字，名字是一种“标识符”，只能由字母，数字，下划线组成，数字不可以出现在第一个位置上，java关键字不可以用做标识符

    浮点数：带小数点的数值，浮点这个词的本意就是指小数点是浮动的，是计算机内部表达非整数的一种方式。(另一种叫定点数，不过在java中不会遇到定点数，人们用浮点数表达所有带小数点的数)
    当浮点数与整数放到一起运算时，java会将整数转换成浮点数，然后进行浮点数的运算。
    */
}
