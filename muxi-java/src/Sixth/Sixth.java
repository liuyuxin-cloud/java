package Sixth;
/**『构造方法与重载』：定义一个网络用户类 要处理的信息有用户ID、用户密码、email地址。
 * 在建立类的实例时 把以上三个信息都作为构造函数的参数输入
 * 其中用户ID和用户密码时必须的
 * 缺省的email地址是用户ID加上字符串"@gameschool.com"
*/
 public class Sixth {
     public static void main(String[] args){
        Users n1 = new Users("2590177089","661585");
        n1.show();
     }
}
class Users{
     private String Id;
     private String key;
     private String emailAddress ;
     public Users(String x, String y,String z){
         Id = x;
         key = y;
         emailAddress = z;
     }
     public Users(String x,String y){
         Id = x;
         key = y;
         emailAddress = x + "@gameschool.com";
     }
     public void  show(){
         System.out.println( Id +"\n"+ key + "\n" + emailAddress);
     }

}
