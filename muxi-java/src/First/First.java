package First;
/**
 * 『构造方法』：编写Java程序模拟简单的计算器。定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
 * 编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、除division等公有成员方法
 * 分别对两个成员变量执行加、减、乘、除的运算。在main方法中创建Number类的对象调用各个方法并显示计算结果。
*/
 public class First{
    public static void main(String[] args){
        Number sample = new Number(11,22);
        System.out.println("他们的和是" + sample.addition());
        System.out.println("他们的差是" + sample.subtration());
        System.out.println("他们的积是" + sample.multiplication());
        System.out.println("他们的商是" + sample.division());


    }
}
class Number {
        private double n1;
        private double n2;

        public Number(double x,double y){
            n1 = x;
            n2 = y;
        }
        public double addition(){
            return n1 + n2;
        }
        public double subtration(){
            return n1 - n2;
        }
        public double multiplication(){
            return n1 * n2;
        }
        public double division(){
            return n1 / n2;
        }

    }

