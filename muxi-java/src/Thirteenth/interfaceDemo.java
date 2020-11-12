package Thirteenth;

/**
 * 『接口』：创建一个名称为Vehicle的接口
 * 在接口中添加两个带有一个参数的方法start()和stop()。
 * 在两个名称分别为Bike和Bus的类中实现Vehicle接口。
 * 创建一个名称为interfaceDemo的类
 * 在interfaceDemo的main()方法中创建Bike和Bus对象 并访问start()和stop()方法。
 */
public class interfaceDemo{
    public static void main(String[] args){
        Bike a = new Bike();
        Bus b = new Bus();
        a.start();
        a.stop();
        b.start();
        b.stop();
    }
}
interface Vehicle{
    void start();
    void stop();
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("自行车开始");
    }
    public void stop(){
        System.out.println("自行车结束");
    }
}
class Bus implements Vehicle{
    public void start(){
        System.out.println("公共汽车开始");
    }
    public void stop(){
        System.out.println("公共汽车结束");
    }
}