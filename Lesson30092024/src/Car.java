public class Car {
    private String brand;
    private int year;
//    default constructor
    public Car() {}

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String name, int year) {
        this.brand = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.brand + ", year: " + this.year;
    }
}
