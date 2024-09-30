public class ConvertTypes {
    public static void main(String[] args) {
        int num = 45;
        int system = 2;
        System.out.println("decimal " + num + " = " + Long.toString(num, system) + " binary");
        System.out.println("decimal " + num + " = " + Integer.toString(num, system) + " binary");
    }
}
