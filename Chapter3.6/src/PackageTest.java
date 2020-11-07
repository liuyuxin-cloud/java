package com.horstmann.corejava;
import java.time.*;
public class PackageTest {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day) ;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
