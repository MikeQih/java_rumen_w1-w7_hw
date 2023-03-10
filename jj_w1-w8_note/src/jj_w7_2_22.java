import java.util.HashSet;

class Value {
    int i;
    public boolean equals(Value v) {
        return v.i == i;
    }
}
public class jj_w7_2_22 {
    public static void main(String[] args) {
        HashSet<Value> set = new HashSet<Value>();
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 39;
        set.add(v1);
        set.add(v2);
        System.out.println(set.size());
        int anar[]=new int[5];
        System.out.println(anar[0]);
    }
}
/*
add部件，把一个部件加到另一个容器中
容器管理这个部件在哪里/显示成多大，管理这些东西的手段：布局管理器
对于frame来说，默认布局管理器叫BorderLayout（第一层North，第二层West Center East，第三层South）默认加到center

内部类就是指一个类定义在另一个类的内部，从而成为外部类的一个成员
因此一个类中可以有成员变量、方法，还可以有内部类(java的内部类也可以被称为 成员类)
内部类的特点就是能够访问外部类的所有成员 
两种：函数内部，类内部
在new对象时给出的类的定义就形成了匿名类，匿名类可以继承某类，也可以实现某接口

JTable类的对象并不存储数据，它只是数据的表现
MVC:数据，表现和控制，三者分离，各负其责
M=Model(模型), V=View(表现), C=Control(控制)
模型：保存和维护数据，提供接口让外部修改数据，通知表现需要刷新 eg. table
表现：从模型获得数据，根据数据画出表现 eg. JTable(在KCB例子中，View和Control被合并成JTable)
控制：从用户得到输入，根据输入调整数据（control和view之间没关系，不直接打交道）

*/