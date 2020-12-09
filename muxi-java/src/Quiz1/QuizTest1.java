package Quiz1;

public class QuizTest1 {
    public static void main(String[] args) {
        蝙蝠侠 n1 = new 蝙蝠侠("洞察力");
        n1.order(new prepareWork());
        神奇女侠 n2 = new 神奇女侠("飞行&神力");
        n2.order(new prepareWork());
    }
}
    abstract class Hero{
        String name;
        String power;
    }
    interface Power{
        void usePower();
    }
    class 蝙蝠侠 extends Hero implements Power {
        String type;

        public 蝙蝠侠(String type) {
            this.type = type;
        }

        public void order(prepareWork prepareWork) {
            System.out.println("准备使用能力");
            prepareWork.prepare(this);
        }
        public void usePower(){
            System.out.println("使用" + type + "能力");
        }
    }
class 神奇女侠 extends Hero implements Power {
    String type;

    public 神奇女侠(String type) {
        this.type = type;
    }

    public void order(prepareWork prepareWork) {
        System.out.println("准备使用能力");
        prepareWork.prepare(this);
    }
    public void usePower(){
        System.out.println("使用" + type + "能力");
    }
}
    class prepareWork{
        public void prepare(Power power){
            System.out.println("正在准备······");
            power.usePower();
        }
    }


