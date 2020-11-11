package Fifth;
/**『构造方法的重载』：定义一个名为Vehicles 交通工具 的基类
 *该类中应包含String类型的成员属性brand 商标 和color 颜色
 * 还应包含成员方法run 行驶在控制台显示“我已经开动了”
 * 和showInfo 显示信息 在控制台显示商标和颜色
  * 编写Car 小汽车 类继承于Vehicles类
 *    增加int型成员属性seats 座位
 *    还应增加成员方法showCar
 *    在控制台显示小汽车的信息 并编写构造方法。
 * 编写Truck 卡车 类继承于Vehicles类
 *    增加float型成员属性load 载重
 *    还应增加成员方法showTruck
 *    在控制台显示卡车的信息 并编写构造方法。 在main方法中测试以上各类。
*/
 public class Fifth {
  public static void main(String[] args){
   Car n1 = new Car("bmw","yellow",5);
   n1.run();
   n1.showInfo();
   n1.showCar();


   Truck n2 = new Truck("bmw","white",12);
   n2.run();
   n2.showInfo();
   n2.showTrack();
  }
}
class Vehicles{
  String brand;
  String colour;

  public Vehicles(String b,String c){
   brand = b;
   colour = c;
  }
  public void run(){
   System.out.println("我已经开动了");
  }
  public void showInfo(){
   System.out.println( brand + " "+ colour );
  }
}
class Car extends Vehicles{
  int seats;
  public Car(String b,String c,int n){
   super(b,c);
   seats = n;
  }
  public void showCar(){
   System.out.println( brand + " " + colour +  "座位数： " + seats );
  }
}
class Truck extends Vehicles{
  float load;
  public Truck(String b,String c,float n){
   super(b,c);
   load = n;
  }
  public void showTrack(){
   System.out.println( brand + " " + colour +  "载重为： " + load );
  }
}
