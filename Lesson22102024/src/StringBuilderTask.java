import java.util.Arrays;

public class StringBuilderTask {
    public static void main(String[] args) {
//        1
//        StringBuilder sb = new StringBuilder();
//        sb.append("StartaUniversity");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);

//        2
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb);

//        sb.insert(6, "beautiful ");
        sb.replace(5, 6, " beautiful ");
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        char[] chars = new char[sb.length()];
        sb.getChars(0, chars.length , chars, 0);
        System.out.println(Arrays.toString(chars));
    }
}
