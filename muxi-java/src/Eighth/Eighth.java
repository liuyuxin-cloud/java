package Eighth;
/**
 * 『构造方法与重载』：建立一个汽车类 包括轮胎个数 汽车颜色 车身重量等属性。并通过不同的构造方法创建事例。
 * 至少要求 汽车能够加速 减速 停车。 要求 命名规范 代码体现层次 有友好的操作提示。
 */
public class Eighth {
    public static void main(String[] args){
        Car car = new Car(4,"white",2.5);
        car.speedUp();
        car.speedDown();
        car.stop();
    }

}
class Car{
    private int wheel;
    private String colour;
    private double weight;

    public Car(){}
    public Car(int a,String b,double c){
        wheel = a;
        colour = b;
        weight = c;
    }
    public void speedUp(){
        System.out.println("The car is speeding up");
    }
    public void speedDown(){
        System.out.println("The car is speeding down");
    }
    public void stop(){
        System.out.println("The car will stop");
    }

}
