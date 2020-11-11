package Seventh;
/**
 * 『构造方法与重载、包 编写 Addition 类』：该类中应包含一组实现两数相加运算的重载方法。
 * 实现加法运算的方法 应接受两个参数 即加数和被加数 方法将两个参数进行加法运算后 返回相加结果。
 * 考虑可能针对不同的数据类型进行计算 重载一组方法 包括整型、长整型、浮点型、双精度浮点型、还有字符串。
 * 在main方法中创建Addition类的实例 分别调用重载方法测试其效果。 应将Addition类打入到包中 以自己名字的拼音为包命名。
 */
public class Seventh {
    public static void main(String[] args){
        Addition n = new Addition();
        System.out.println(n.addition(1,2));
        System.out.println(n.addition(1.25,2.459));
        System.out.println(n.addition(123465495132L,1253695432159132L));
        System.out.println(n.addition(0.12f,0.24f));
        System.out.println(n.addition("double ","eleven"));
    }
}
class Addition{
    public int addition(int a,int b){
        return a + b;
    }
    public double addition(double a,double b){
        return a + b;
    }
    public long addition(long a,long b){
        return a + b;
    }
    public float addition(float a,float b){
        return a + b;
    }
    public String addition(String a,String b){
        return a + b;
    }
}
