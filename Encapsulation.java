class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public double getSalary() {
        return salary;
    }

}

class Encapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("Raju");
        e1.setSalary(20000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}