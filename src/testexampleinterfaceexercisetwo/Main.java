package testexampleinterfaceexercisetwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        somethingTwo b = new Programmer();
        ((Programmer)b).getName();

        System.out.println(nameInterface.PI);

        int[] tab = new int[3];
        tab[0] = 3;
        tab[1] = -5;
        tab[2] = 13;

        Arrays.sort(tab);
        System.out.println(tab[0]);

        Employee[] employees = new Employee[3];
        employees[0] = new Employee(10000);
        employees[1] = new Employee(20000);
        employees[2] = new Employee(3400);

        Arrays.sort(employees);
        System.out.println(employees[0].getSalary());
        System.out.println(employees[1].getSalary());
        System.out.println(employees[2].getSalary());



    }
}

interface somethingTwo{

}

interface nameInterface{

    double PI = 3.14;

    void something();
}

class Employee implements nameInterface, somethingTwo, Comparable {

    Employee(double salary){
        this.salary = salary;
    }

    public Employee() {

    }

    public void something(){

    }

    private double salary;
    public double getSalary(){
        return this.salary;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class A{

}

class Programmer extends Employee implements somethingTwo{
    String name;

    Programmer(double salary) {
        super(salary);
    }

    public Programmer() {
        super();
    }

    String getName(){
        return this.name;
    }

}
