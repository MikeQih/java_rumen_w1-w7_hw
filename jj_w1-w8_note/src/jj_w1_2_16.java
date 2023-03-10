
public class jj_w1_2_16 {
    // Vending Machine
    int price=80;
    int balance;
    int total;
    void setprice(int price){
        this.price = price;
    }
    void showPrompt(){
        System.out.println("Welcome");
    }
    void insertMoney(double amount){
        balance += amount;
        showBalance();
    }
    void showBalance(){
        System.out.println(balance);
    }
    void getFood(){
        if(balance>=price){
            System.out.println("here you are");
        }
        balance -= price;
        total += price;
    }
    
    
    public static void main(String[] args) {
        jj_w1_2_16 vm = new jj_w1_2_16();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();        
        vm.showBalance();
    }
}
/*
对象是实体，需要被创建，可以为我们做事情
类是规范，根据类的定义来创建对象
类定义了对象，而每一个对象都是类的实体
封装：把数据和对数据的操作放在一起
1.1的shape package图没画
定义在函数内部的变量是本地变量，外部的是成员变量
成员变量的生存期是对象的生存期，作用域是类内部的成员函数

如果一个成员函数名字和类名完全相同，则在创建这个类的每一个对象的时候会自动调用这个函数->构造函数
这个函数不能有返回类型

重载：一个类可以有多个构造函数，只要他们参数表不同
创建对象时给出不同的参数值，就会自动调用不同的构造函数，一个类里的同名但参数表不同的函数构成了重载关系

*/