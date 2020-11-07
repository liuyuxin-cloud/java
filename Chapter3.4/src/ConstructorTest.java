import java.util.*;
public class ConstructorTest {
    public static void main(String[] args){
        //fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Herry",40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();
    }
class Employee{
    private static int nextId;
    private int id;
    private String name = "" ;
    private double salary;
        //static initialization block
    static {
        var generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
        }
    {
        id = nextId;
        nextId++;
    }
    public Employee(String n,double s){
        name = n;
        salary = s;

    }
    public Employee(double s){
        this("Employee #" + nextId,s);
    }
    public Employee(){

    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return  getSalary();
    }
    public int getId{
        return id;
    }

}

