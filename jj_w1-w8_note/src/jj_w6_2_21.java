public class jj_w6_2_21 {//18:35
    public static void main(String[] args) {
        int a=5;
        int b=2;
        System.out.println((double)a/b);
        System.out.println((double)(a/b));
        System.out.println(a/b);
        
    }
}
/*
如果一个类有了一个抽象的方法，这个类就必须声明为抽象类。如果父类是抽象类，那么子类必须覆盖所有在父类中的抽象方法，否则子类也成为一个抽象类。
abstract抽象类可以没有抽象方法。设计抽象类主要是为了防止制造这个类的对象出来。
抽象类不能制造对象，但是可以定义变量，继承自抽象类的子类必须覆盖父类中的抽象函数

程序的业务逻辑与表现无关，表现可以是图形的也可以是文本的，也可以是当地的或是远程的
接口是纯抽象类，所有成员函数都是抽象函数，所有成员变量都是public static final(实现用implements)

instanceof 测试左边的类是否是右边的实例 eg.if(an instanceof listRabbit){}

*/
