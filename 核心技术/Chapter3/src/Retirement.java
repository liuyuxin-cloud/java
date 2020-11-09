import java.util.*;
public class Retirement {
    public static void main(String[] args)
    {
        //read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Interestrate in %:");
        double interestRate = in.nextDouble();

        double banlance = 0;
        int years = 0;

        //update account balance while goal isn't reached
        while ( banlance < goal ){
            //add this year's payment and interest
            banlance += payment;
            double interest = banlance * interestRate / 100;
            banlance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years.");
    }
}
