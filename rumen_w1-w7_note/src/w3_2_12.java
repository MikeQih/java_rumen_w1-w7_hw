import java.util.Scanner;

public class w3_2_12 {
    public static void main(String[] args) {
        // Scanner x = new Scanner(System.in);
        // int number = x.nextInt();
        // int count=0;

        // do
        // {
        //     number /= 10;
        //     count += 1;
        // } while(number>0);

        // int n = 10;
        // int count=0;
        // do
        // {
        //     n-=1;
        //     count+=1;
        // }while(n>0);
        // System.out.println(count);

        // Scanner x = new Scanner(System.in);
        // int num;
        // int sum=0;
        // int count=0;
        // num = x.nextInt();
        // while(num!=-1){
        //     sum+=num;
        //     count+=1;
        //     num = x.nextInt();
        // }
        // System.out.println("平均数是："+(double)sum/count);

        // int num = (int)(Math.random()*100+1); //Math.random()是0-1之间的数
        // Scanner input = new Scanner(System.in);
        // int count=0;
        // int a;
        // do{
        //     System.out.print("请猜一个数字：");
        //     a = input.nextInt();
        //     count+=1;
        //     if(a>num)
        //         System.out.println(("大了"));
        //     else if(a<num)
        //         System.out.println(("小了"));

        // }while (a!= num);
        // System.out.println("你猜对了，猜了"+count+"次。");
        
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // int result=0;
        // int digit;
        // while(x>0){
        //     digit = x%10;
        //     result = result*10+digit;
        //     x/=10;
        // }
        // System.out.println(result);

        //w3 hw1 输入一系列数，-1结束，输出 奇数和偶数的个数
        // System.out.print("请输入数字：");
        // Scanner num = new Scanner(System.in);
        // int oddn=0,evenn=0;
        // int n = num.nextInt();
        // while(n!=-1){
        //     if(n%2==0){
        //         evenn+=1;
        //     }
        //     else{
        //         oddn+=1;
        //     }
        //     System.out.print("请输入数字：");
        //     n = num.nextInt();
        // }
        // System.out.println(oddn+" "+evenn);

        //w3 hw2 判断数的正位和反位的奇偶性 然后把结果用二进制加起来
        System.out.print("请输入数字：");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        // num.close(); //问放在哪合适
        int count=1;
        int result=0;
        int digit;
        while(x>0){
            digit = x%10;
            if(digit%2==count%2){
                result += Math.pow(2, count-1);
            }
            x/=10;
            count+=1;
        }
        System.out.println(result);
        
        
        //看到第四周 循环控制
    }
}
