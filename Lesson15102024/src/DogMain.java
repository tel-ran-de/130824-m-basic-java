public class DogMain {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik", 3);
        Dog spike = new Dog("Spike", 7);
        Dog dog = new Dog();

        System.out.println(bobik == spike);
        bobik.equals(spike);
//        System.out.println(bobik.getClass());
        System.out.println(bobik);
//        System.out.println(bobik.getName());
//        bobik.sleep();
//
//        System.out.println(spike.getName());
//        spike.sleep();
//
//        System.out.println(dog.getName());
//        System.out.println(dog.getAge());
//        dog.sleep();
    }
}
