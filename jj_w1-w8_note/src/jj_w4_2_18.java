import java.util.Scanner;

public class jj_w4_2_18 {//11:07
    public static void main(String[] args) {
        
        
    }
}
/*
基于已有的设计创造新的设计，就是面向对象程序设计中的继承 extends
通过继承，新的类自动获得基础类中所有的成员，包括成员变量和方法，各种访问属性的成员，无论是public还是private
子类从父类得到了：所有的东西，所有的父类的成员，包括变量和方法，除了构造方法。
缺省构造器default constructor，是指编译器在程序员没有定义任何构造函数下自动生成的构造函数，通常是无用的构造函数
父类的私有函数子类不能使用，除非把private改成protected，或使用从父类中继承得到的方法调用
一个变量可以保存其所声明的类型或该类型的任何子类型
“多态”是指: 一个变量可以保存不同类型(即其声明的类型或任何子类型)的对象。

子类对象赋给父类的变量的时候，就发生了向上造型(向上造型是默认/安全的，不需要运算符)
造型：把一个类型的对象，赋给另一个类型的变量(类型转换和(CD)造型是不同的，类型转换是真的改变了值，造型时对象本身并没发生任何变化)
当调用一个方法时，究竟应该调用哪个方法，这种事情叫做绑定；分为两种：早绑定(静态绑定 根据变量的声明类型来决定)，晚绑定(动态绑定 根据变量的动态类型来决定)

覆盖override 子类和父类存在名称和参数表完全相同的函数，这对函数构成覆盖关系
通过父类的变量调用存在覆盖关系的函数时，会调用变量当时所管理的对象所属的类的函数

Override告诉编译器下一行的那个函数，覆盖了父类的那个函数(必须与父类的函数具有完全相同的函数名字，参数表，都是public)

Overload重载：是在一个类中，相同方法名，但不同参数的方法。每个重载的方法都要有不同的参数列表，返回值类型可以相同也可以不同。
最常用的是构造器的重载。

代码不需要修改，就能适应新的数据和内容->可扩展性
经过修改然后获得新的数据和内容->可维护性

*/