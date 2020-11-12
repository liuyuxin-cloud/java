package Fifteenth;

/**
 * 『抽象类、继承、接口综合』：设计一个系统 xxx 纯净水生产线
 * 目前流程是 从某个地方把水取出来 然后经过缓冲 过滤 加热和放糖的步骤
 * abstract 水{ public void 水(); }
 * interface 过滤{} interface 缓冲{} interface 加热{} interface 放糖{}
 *  class 纯净水1 extends 水 imps 过滤,缓冲{} class 纯净水2 extends 水 imps 缓冲{} class 纯净水2 extends 水 imps 过滤{}
 */
public class Fifteenth {
}
abstract class 水{
    public void water(){};
}
interface 过滤{
    public void 过滤();
}
interface 缓冲{
    public void 缓冲();
}
interface 加热{
    public void 加热();
}
interface 放糖{
    public void 放糖();
}
class 纯净水1 extends 水 implements 过滤,缓冲,加热,放糖{
    public void water(){
        System.out.println("水的生产线");
    }
    public void 过滤(){
        System.out.println("水需要过滤");
    }
    public void 缓冲(){
        System.out.println("水需要缓冲");
    }
    public void 加热(){
        System.out.println("水需要加热");
    }
    public void 放糖(){
        System.out.println("水需要放糖");
    }
}
class 纯净水2 extends 水 implements 过滤,缓冲,加热,放糖{
    public void water(){
        System.out.println("水的生产线");
    }
    public void 过滤(){
        System.out.println("水需要过滤");
    }
    public void 缓冲(){
        System.out.println("水需要缓冲");
    }
    public void 加热(){
        System.out.println("水需要加热");
    }
    public void 放糖(){
        System.out.println("水需要放糖");
    }
}
class 纯净水3 extends 水 implements 过滤,缓冲,加热,放糖{
    public void water(){
        System.out.println("水的生产线");
    }
    public void 过滤(){
        System.out.println("水需要过滤");
    }
    public void 缓冲(){
        System.out.println("水需要缓冲");
    }
    public void 加热(){
        System.out.println("水需要加热");
    }
    public void 放糖(){
        System.out.println("水需要放糖");
    }
}
