class Employee {
    String name;
    int salary;
    String department;

    // Constructor overloading
    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", department: " + department);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raju");
        e1.displayDetails();

        Employee e2 = new Employee("Raju", 30000);
        e2.displayDetails();

        Employee e3 = new Employee("Raju", 30000, "IT");
        e3.displayDetails();
    }
}
