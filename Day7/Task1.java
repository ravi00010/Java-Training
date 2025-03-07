package Day7;

abstract class Employee {
    String name;
    int employeeid;

    abstract void CalculatedSalary();

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeid);
    }
}

class FullTimeEmployee extends Employee {
    int salary;

    FullTimeEmployee(String name, int employeeid, int salary) {
        this.name = name;
        this.employeeid = employeeid;
        this.salary = salary;
        ;

    }

    @Override
    void CalculatedSalary() {
        System.out.println("Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    int salary;

    PartTimeEmployee(String name, int employeeid, int hours) {
        this.name = name;
        this.employeeid = employeeid;
        this.hours = hours;
    }

    void CalculatedSalary() {
        salary = hours * 500;
        System.out.println("Salary: " + salary);
    }
}

public class Task1 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Ravi", 101, 50000);
        fte.showDetails();
        fte.CalculatedSalary();
        PartTimeEmployee pte = new PartTimeEmployee("Rohan", 102, 50);
        pte.showDetails();
        pte.CalculatedSalary();
    }
}
