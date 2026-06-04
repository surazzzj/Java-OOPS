class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

}

public class EncapsulationWithConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raju", 20000, "IT");

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getDepartment());
    }
}
