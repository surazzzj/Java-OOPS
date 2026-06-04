class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum of a & b is: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum of a, b & c is: " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Sum of a & b is: " + (a + b));
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(10.5, 20.5);
    }
}