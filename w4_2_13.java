import java.util.Scanner;

public class w4_2_13 {
    public static void main(String[] args) {
        // Scanner x = new Scanner(System.in);
        // int factor = 1;
        // int n = x.nextInt();
        // out:
        // for(int i=1;i<=n;i++){
        //     factor *= i;
        //     break out;
        // }
        // System.out.println(factor);

        int amount=20;
        OUT:
        for(int one=0;one<=amount;one++){
            for(int five=0;five<=amount/5;five++){
                for(int ten=0;ten<=amount/10;ten++){
                    if(one+five*5+ten*10==amount){
                        System.out.println(one+"张1元 "+five+"张5元 "+ten+"张10元");
                        break OUT;
                    }
                }
            }
        }
        System.out.println((2>2)||((4==4)&&(1<0)));
        System.out.println((34!=33)&&!false);

        // Scanner x = new Scanner(System.in);
        // int n = x.nextInt();
        // double sum=0.0;
        // int sign=1;
        // for(int i=1;i<=n;i++,sign*=-1){
        //     sum += sign*1.0/i;
        // }
        // System.out.printf("%.1f\n",sum);

        //辗转相除法
        // Scanner x = new Scanner(System.in);
        // System.out.print("请输入两个数字：");
        // int a = x.nextInt();
        // int b = x.nextInt();
        // int oa = a;
        // int ob = b;
        // while(b!=0){
        //     int r = a%b;
        //     a = b;
        //     b = r;
        // }
        // System.out.println(oa+"和"+ob+"的最大公约数为："+a);

        
        //w4 hw Q1, 输入n，m两个数字，输出包括第n至m间素数的和
        Scanner x = new Scanner(System.in);
        System.out.print("请输入两个数字：");
        int n = x.nextInt();
        int m = x.nextInt();
        int result = 0;
        int count = 0;
        for(int i=2;count<=((m-n)+1);i++){
            boolean isPrime=true;
            for(int j=2;j<i;j+=1){
                if(i%j==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime==true){
                count+=1;
                if(count>=n && count<=m){
                    result += i;
                    // System.out.print(i+" ");
                }
            }
        }
        System.out.println("result is :"+result);

        
        //w4 hw Q2，读入一个[-100000,100000]的整数，用拼音输出 16:13
        // Scanner x = new Scanner(System.in);
        // System.out.print("请输入1个整数：");
        // String r = "";
        // int n = x.nextInt();
        // int n_initial = n;
        // int result=0;
        // int count_0 = 0;
        // if(n>=-1e5 && n<=1e5){
        //     while(Math.abs(n)%10==0){
        //         count_0+=1;
        //         n/=10;
        //     }
        //     while(Math.abs(n)>0){
        //         int digit_old = Math.abs(n)%10;
        //         result = result*10 +digit_old;
        //         n/=10;
        //     }
            
        //     while(result>0){ //now reverse the result, get correct order
        //         int digit = result%10;
        //         result/=10;
        //         switch(digit){
        //             case 0:
        //                 r += "ling";
        //                 break;
        //             case 1:
        //                 r += "yi";
        //                 break;
        //             case 2:
        //                 r += "er";
        //                 break;
        //             case 3:
        //                 r += "san";
        //                 break;
        //             case 4:
        //                 r += "si";
        //                 break;
        //             case 5:
        //                 r += "wu";
        //                 break;
        //             case 6:
        //                 r += "qi";
        //                 break;
        //             case 7:
        //                 r += "qi";
        //                 break;
        //             case 8:
        //                 r += "ba";
        //                 break;
        //             case 9:
        //                 r += "jiu";
        //                 break;
        //             }
        //         if(result!=0){
        //             r+=" ";
        //         }
        //         }
        //         String sling="";
        //         if(n_initial<0){
        //             if(count_0>0){
        //                 for(int i=0;i<count_0;i++){
        //                     sling += " ling";
        //                 }
        //                 System.out.println("fu "+r+sling);
        //             }
        //             else{
        //                 System.out.println("fu "+r);
        //             }
        //         }
                
        //         else{
        //             if(count_0>0){
        //                 for(int i=0;i<count_0;i++){
        //                     sling += " ling";
        //                 }
        //                 System.out.println(r+sling);
        //             }
        //             else{
        //                 System.out.println(r);
        //             }
        //         }
                
        //     }    
    }
}

/*
int 4个字节 [-2^31, 2^31-1]
for 和 while都是进循环体之前先判断
有固定次数，for；必须执行一次，do while；其他情况用while
eg.i=6,a=i++,a=6,i=7; a=++i,a=7,i=7，i++是后缀 a是i+1以前的值，++i是前缀 a是i+1以后的值；
循环前可以放一个标号来标识循环 eg.label:, break label跳出多重循环
! > && > ||
*/
