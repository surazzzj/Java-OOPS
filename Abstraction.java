abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println(name + "'s Salary: ₹" + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println(name + "'s Salary: ₹" + salary);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Raju", 50000);
        Employee emp2 = new PartTimeEmployee("Sam", 40, 500);

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}