public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Capacity = " + sb.capacity());
        System.out.println("Length = " + sb.length());
        sb.append("I learn Java!!!!!!");
//        sb.append("I learn JS!!!!!!");
//        sb.append("I learn QA!!!!!!");
        System.out.println(sb);
        System.out.println();
        System.out.println("Capacity = " + sb.capacity());
        System.out.println("Length = " + sb.length());
        System.out.println();
//        sb.delete(2, 8);
//        sb.delete(20, 26);
        System.out.println(sb);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println();
        System.out.println(sb);
        System.out.println();
        sb.replace(8, 12, "JS");
        System.out.println(sb);
        System.out.println();
//        sb.reverse();
//        System.out.println(sb);

//        check polindrom
//        String str = "1234321";
//        StringBuilder sbPolindrom = new StringBuilder(str);
//        sbPolindrom.reverse();
//        System.out.println(str.equals(sbPolindrom.toString()));

        String subString = sb.substring(2);
        System.out.println(subString);
        String subString1 = sb.substring(2, 7);
        System.out.println(subString1);
        System.out.println(sb);

    }
}
