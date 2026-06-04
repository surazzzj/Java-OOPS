class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working! Employee Details: Name- "
                + name + ", Salary- " + salary);
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);               // Using super keyword we can access parent class members
    }


    // Method Overriding
    @Override
    void work() {
        System.out.println("Manager is managing the team! Manager Details: Name- "
                + name + ", Salary- " + salary);
    }

    void managerWork() {
        System.out.println("Manager is taking reviews of reports");
    }
}

class InheritanceWiithOverriding {
    public static void main(String[] args) {

        Employee e1 = new Employee("Sam", 40000);
        e1.work();

        Manager m1 = new Manager("Raj", 80000);
        m1.work();
        m1.managerWork();
    }
}