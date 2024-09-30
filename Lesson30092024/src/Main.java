import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Java!!!");
//        Car car = new Car();
//      before initialization
//        System.out.println(car.year);
//        System.out.println(car.name);
//      after init
//        car.name = "Audi";
//        car.year = 2002;


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a name");
//        car.name = sc.nextLine();
//        System.out.println("Enter a year");
//        car.year = sc.nextInt();
//        System.out.println(car.year);
//        System.out.println(car.name);

        Car toyota = new Car("Toyota");
        System.out.println(toyota);

        Car toyota1991 = new Car(1991);
        System.out.println(toyota1991);

        Car tesla2020 = new Car("Tesla", 2020);
        System.out.println(tesla2020);

//        Car car = new Car();

    }
}