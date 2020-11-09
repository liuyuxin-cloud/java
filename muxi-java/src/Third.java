/**
 * 『get 方法和 set 方法』：定义一个类该类有一个私有成员变量通过构造方法将其进行赋初值并提供该成员的getXXX()和setXXX()方法。
*/
 public class Third {
    public static void main(String[] args){
        Method sample = new Method();
    }
}
class Method{
    private int x;

    public Method(){}

    public void set(int i){
        x = i;
    }
    public int get(){
        return x;
    }

}
