package Fourteenth;

/**
 * 『抽象类、继承、接口综合』：设计一个系统 XXX门的实现过程
 * 流程 设计一张抽象的门 Door
 * 那么对于这张门来说 就应该拥有所有门的共性开门 openDoor() 和关门 closeDoor()
 * 然后对门进行另外的功能设计,防盗--theftproof()、防水--waterproof()、防弹--bulletproof()、防火、防锈……
 * 要求 利用继承、抽象类、接口的知识设计该门。
 */

public class Fourteenth {
    public static void main(String[] args){
        gaojidoor n = new gaojidoor();
        n.openDoor();
        n.closeDoor();
        n.theftproof();
        n.waterproof();
        n.bulletproof();
    }
}
abstract class Door{
    public void openDoor(){};
    public void closeDoor(){};
}
interface theftproof{
    public void theftproof();
}
interface waterproof{
    public void waterproof();
}
interface bulletproof{
    public void bulletproof();
}
class gaojidoor extends Door implements theftproof,waterproof,bulletproof{
    public void openDoor(){
        System.out.println("开门");
    }
    public void closeDoor(){
        System.out.println("关门");
    }
    public void theftproof(){
        System.out.println("此门能防盗");
    }
    public void waterproof(){
        System.out.println("此门能防水");
    }
    public void bulletproof(){
        System.out.println("此门能防弹");
    }
}

