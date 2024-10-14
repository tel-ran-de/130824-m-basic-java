public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Current step (for) - "  + (i + 1));
//        }

//        int j = 0;
//        while (j < 10) {
//            System.out.println("Current step (while) - "  + (j + 1));
//            j+=2;
//        }
//        int k = 0;
//        while (2 == 2) {
//            k += 2;
//            System.out.println(k);
//            break;
//            if (k < 20) {
//                System.out.println(k);
//            }
//            else {
//                break;
//            }
//        }
        int i = 1;
        do {
            System.out.println("i = " + i);
            i *= 3;
        } while (i < 10);

    }
}