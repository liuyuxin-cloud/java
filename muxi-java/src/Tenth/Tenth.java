package Tenth;
/**
 * 『static 关键字与普通变量的区别』：创建一个名称为StaticDemo 的类并声明一个静态变量和一个普通变量。
 * 对变量分别赋予10和5的初始值。在main()方法中输出变量值。
 */
public class Tenth {
    public static void main(String[] args){
        System.out.println(StaticDemo.a);
        StaticDemo n = new StaticDemo();
        System.out.println(n.b);
    }
}
class StaticDemo{
    static int a = 10;
    int b = 5;
}