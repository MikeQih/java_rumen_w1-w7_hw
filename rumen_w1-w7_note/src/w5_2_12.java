import java.util.Scanner;

import javax.xml.transform.Source;

public class w5_2_12 {
    public static void main(String[] args) {
        // Scanner x = new Scanner(System.in);
        // System.out.print("请输入数字的个数：");
        // int cnt=x.nextInt();
        // double sum=0;
        // if(cnt>0){
        //     int[] numbers = new int[cnt];
        //     for(int i=0;i<cnt;i++){
        //         // System.out.print("请输入数字：");
        //         numbers[i] = x.nextInt();
        //         sum+=numbers[i];
        //     }
        //     double avg=sum/cnt;
        //     for(int i=0;i<numbers.length;i++){//可扩展性
        //         if(numbers[i]>avg){
        //             System.out.println("高于平均数的值："+numbers[i]);
        //         }
        //     }        
        // }

        // int[] numbers = {1,2,3,4,5,6};
        // for(int i=0;i<numbers.length;i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // int[] a={1,2,3};
        // int[] b={1,2,3};
        // System.out.println(a[1]); //java 索引必须是0到(length-1)之间
        
        // int[] numbers = new int[9];
        // Scanner num = new Scanner(System.in);
        // System.out.print("请输入0-9的任意数字：");
        // int x = num.nextInt();
        // while(x!=-1){
        //     if(x>=0 && x<=9){
        //         numbers[x]++;
        //     }
        //     x = num.nextInt();
        // }
        // for(int i=0;i<numbers.length;i++){
        //     System.out.println(i+":"+numbers[i]);
        // }
        // for(int i:numbers){ //for each 循环 直接就是数组的元素
        //     System.out.println("for-each loop: :"+i);
        // }

        // int[] primes = new int[10];
        // primes[0]=2;
        // int count=1;
        // MAIN_LOOP:
        // for(int i=3;count<10;i++){
        //     for(int j=0;j<count;j++){
        //         if(i%primes[j]==0){
        //             continue MAIN_LOOP;
        //         }
        //     }
        //     primes[count++] = i;
        // }
        // for(int k:primes){
        //     System.out.print(k+" ");
        // }
        
        // boolean[] isPrimes = new boolean[50]; //50以内的素数
        // for(int i=2;i<isPrimes.length;i++){
        //     isPrimes[i]=true;
        // }
        // for(int i=2;i<isPrimes.length;i++){
        //     if(isPrimes[i]){
        //         for(int k =2;i*k<isPrimes.length;k++){
        //             isPrimes[i*k]=false;
        //         }
        //     }
        // }
        // for(int i=0;i<isPrimes.length;i++){
        //     if(isPrimes[i]){
        //         System.out.println(i+" ");
        //     }
        // }

        int[][] erWei = {{1,2,3},{4,5,6}};
        // int[][] erWei = new int[2][];
        // for(int i=0;i<erWei.length;i++){
        //     erWei[i] = new int[i+1];
        //     for(int j=0;j<erWei[i].length;j++){
        //         erWei[i][j] = i+j;
        //     }
        // }
        System.out.println(erWei[0]);
        System.out.println((erWei[1]));
        //m1 遍历二维数组
        // for(int[] i:erWei){
        //     for(int j:i){
        //         System.out.println(j);
        //     }
        // }

        //m2
        // for(int i=0;i<erWei.length;i++){
        //     for(int j=0;j<erWei[i].length;j++){
        //         System.out.println(erWei[i][j]);
        //     }
        // }


        //w5 hw 多项式加法
        // Scanner num = new Scanner(System.in);
        // System.out.println("请输入第一个多项式的幂和次数：");
        // int m = num.nextInt();
        // int mcishu = num.nextInt();
        // int mmax = 0;
        // int nmax = 0;
        // int[] numbers = new int[101];
        // while(m>=0){//first
        //     if(m>mmax){
        //         mmax = m;
        //     }
        //     numbers[m]= mcishu;
        //     // System.out.print("请输入第一个多项式的幂和次数：");
        //     m = num.nextInt();
        //     mcishu = num.nextInt();
        //     if(m==0){
        //         numbers[0]+=mcishu;
        //         break;
        //     }
        // }

        // System.out.println("请输入第二个多项式幂和次数：");
        // int n = num.nextInt();
        // int ncishu = num.nextInt();
        // while(n>=0){//second
        //     if(n>nmax){
        //         nmax = n;
        //     }
        //     numbers[n]+= ncishu;
        //     // System.out.print("请输入第二个多项式的幂和次数：");
        //     n = num.nextInt();
        //     ncishu = num.nextInt();
        //     if(n==0){
        //         numbers[0]+=ncishu;
        //         break;
        //     }
        // }
        // String s = "";
        // for(int i=Math.max(mmax,nmax);i>=0;i--){
        //     if(numbers[i]!=0 && i>1){
        //         s+=numbers[i]+"x"+i+"+";
        //         continue;
        //     }
        //     else if(numbers[i]!=0 && i==1){
        //         s+=numbers[i]+"x"+"+";
        //         continue;
        //     }
        //     else if(i==0){
        //         s+=numbers[i];
        //         break;
        //     }
        // }
        // System.out.println(s);



    }
}
/*
java使用Unicode表示字符，一个字符加一个数字得到Unicode码表中那个数之后的字符
ASCII编码是1个字节，而Unicode编码通常是2个字节。 
字母A用ASCII编码是十进制的65，二进制的01000001；而在Unicode中，只需要在前面补0，即为：00000000 01000001

a是个数组，int[]b=a,a和b两个管理者共同管理一个数组（因为没建新的数组）
数组变量之间的赋值是管理权限的赋予

数组变量之间的比较是判断是否管理同一个数组
eg.
int[] a={1,2,3};
int[] b={1,2,3};
System.out.println(a==b); //false
a[i][j] 第i行，第j列

*/
