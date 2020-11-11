package Eleventh;

/**
 * 『覆盖、继承』：建立一个汽车Auto类 包括轮胎个数 汽车颜色 车身重量、速度等成员变量。并通过不同的构造方法创建实例。
 * 至少要求 汽车能够加速 减速 停车。 再定义一个小汽车类Car 继承Auto 并添加空调、CD等成员变量 覆盖加速 减速的方法。
 */

class Auto{
    int wheel;
    String colour;
    double weight;
    double speed;
    public Auto(){}
    public void speedUp(){
        System.out.println("speedUp");
    }
    public void speedDown(){
        System.out.println("speedDown");
    }
    public void stop(){
        System.out.println("stop");
    }
}
class Car extends Auto{
    boolean airConditioner;
    String cd;

    public void speedUp() {
        System.out.println("car speedUp");

    }
    public void speedDown(){
        System.out.println("car speedDown");
    }
}
