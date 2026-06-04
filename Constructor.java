class Car {
    String brand;
    String color;

    // Parameterized constructor
    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + " , Color: " + color);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "Black");
        c1.displayInfo();

        Car c2 = new Car("Ford", "Yellow");
        c2.displayInfo();

        Car c3 = new Car("Nissan", "Grey");
        c3.displayInfo();
    }
}