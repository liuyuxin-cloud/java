package Ninth;

/**
 * 『构造方法与重载』：创建一个类 为该类定义三个构造函数 分别执行下列操作
 * 1、传递两个整数值并找出其中较大的一个值
 * 2、传递三个double值并求出其乘积
 * 3、传递两个字符串值并检查其是否相同
 * 4、在main方法中测试构造函数的调用
 */
public class Ninth {
    public static void main(String[] args) {
    Ninth n = new Ninth();
    n.multiply(2.1,3.5,4.6);
    n.equal("xiaofang","xiaoli");
    }
    public void max(int a,int b){
        System.out.printf("%d\n",( a > b ) ? a : b) ;
    }
    public void multiply(double a,double b,double c){
        System.out.printf("%f\n",a * b * c);
    }
    public void equal(String a,String b){
        if( a == b) System.out.println("true");
        else System.out.println("false");
    }
}

