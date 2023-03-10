import java.util.Scanner;

public class jj_w8_2_24 {

    public static void f(){
        int[] a = new int[10];
        a[10] = 10;
        System.out.println("Hello");
    }

    public static void g(){
        f();
    }

    public static void h(){
        int i=0;
        if(i<100){
            g();
        }
    }

    public static void k(){
        try{
            h();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("k()");
            throw e;
        }
    }
    
    public static void main(String[] args) {
        try{
            k();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("caught");
            System.out.println("e.getMessgae(): "+e.getMessage());
            System.out.println("e: "+e.toString()+"\n");//不用toString，就一个e也一样
            e.printStackTrace();
        }
        System.out.println("main");
    }
}
/*
拿到异常对象之后：
String getMessgae(); String toString(); void printStackTrace();
printStackTrace()：知道异常是在哪发生的，以及中间的调用轨迹
任何继承了Throwable类的对象都能扔，Exception类继承了Throwable
catch (Exception)可以捕捉所有异常
如果函数可能抛出异常，就必须在函数头部加以声明 eg.void f() throws Toobig...{//...}
当覆盖一个函数时，子类不能声明抛出比父类的版本更多的异常
在子类的构造函数中，必须声明父类可能抛出的全部异常

流的基础类：
InputStream
OutputStream

文件流：
FileInputStream
FileOutputStream
流可以叠加很多过滤器（Data,Buffer,File...) eg.例子见IO_main

常用BufferedReader和readLine()把文本的一整行都读入

阻塞/非阻塞？ read()函数是阻塞的，在读到所需内容之前会停下来等（没太懂这部分，需要掌握？）
对象串行化（Serializable）是一种更好的方法把对象，整个地写到流里面去

期末考试前五题：CCBDD
Q21: java的char类型是16位 表示Unicode字符
Q24: final变量可以在不止一个地方初始化？

try{
    //可能产生异常的代码
} catch(Type1 id1){
    //处理Type1异常的代码
} catch(Type2 id2){
    //处理Type2异常的代码
} catch(Type3 id3){
    //处理Type3异常的代码
}


*/