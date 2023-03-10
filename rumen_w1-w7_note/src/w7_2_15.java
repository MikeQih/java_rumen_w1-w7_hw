import java.util.Scanner;
import java.util.function.Function;

public class w7_2_15 {
    // public static int sum(int a, int b){
    //     int sum=0;
    //     for(int i=a;i<=b;i++){
    //         sum+=i;
    //     }
    //     return sum;
    // }

    public static boolean isPrime(int a){
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;

    }

    public static void prime_function(int a){
        String r="";
        while(a!=1){
            for(int i=2;i<=a;i++){
                if(i==a){
                    a=1;
                    r+=i;
                    break;
                }
                if(isPrime(i) && (a%i==0)){
                    a/=i;
                    r += i+"x";
                    break;
                }
            }
        }
        System.out.println(r);

    }

    public static boolean perfect_number(int a){
        int isum=0;
        boolean r=false;
        for(int i=1;i<a;i++){
            if(a%i==0){
                isum+=i;
            }
        }
        if(isum==a){
            r = true;
        }
        return r;
    }

    public static void main(String[] args) {
        // sum(0,10);
        // sum(20,30);
        // sum(30,40);
        // int c;
        // c = sum(0,10);
        // System.out.println(c);
        
        //w7 hw Q1 输入一个非素数，输出其素数质因数分解式，如果该整数本身为素数，输出本身
        Scanner num = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int x = num.nextInt();
        if(x>=2 && x<=1e5){
            if(isPrime(x)){
                System.out.println(x);
            }
            else{//为啥错了
                prime_function(x);
            }
        }

        //w7 hw Q2 输入两个数字，输出其间所有的完数
        // Scanner num = new Scanner(System.in);
        // System.out.println("请输入两个数字：");
        // int num1 = num.nextInt();
        // int num2 = num.nextInt();
        // String r="";
        // for(int i=Math.min(num1, num2);i<Math.max(num1, num2);i++){
        //     if(perfect_number(i)){
        //         r+= i+" ";
        //     }
        // }
        // if(r.length()==0){
        //     System.out.println(0);
        // }
        // else{
        //     System.out.println(r.trim());
        // }
        

        
    }
}
/*
当传递的值与函数参数类型不匹配时，当函数期望的参数类型比调用函数时给的值更宽，就可以，
编译器帮忙把类型转换好。eg. char->int->double 窄到宽(int可以传进double)
对于本地变量：生存期和作用域都在大括号内块
*/