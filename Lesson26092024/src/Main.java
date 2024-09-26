public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        String str = "Java";
//        System.out.println("Before");
//        System.out.println(str.length());
//        System.out.println(str);
//        System.out.println(str.hashCode());
        str = str + "!?}";
//        System.out.println("After");
//        System.out.println(str);
//        System.out.println();
//        System.out.println(str.hashCode());

//        length of our String
        int strLength = str.length();
//        System.out.println(strLength);
//        System.out.println();
//        get last char from our String
//        System.out.println(str.charAt(strLength - 1));
//        System.out.println();
//        Substring from our String. Start index = 4, end index = str.length() - 1
//        System.out.println(str.substring(4));
//        Substring from start index = 3 and end index = 4(5  is not include)
//        System.out.println(str.substring(3, 5));

        String upperCaseString = "JAVA";
        System.out.println(upperCaseString);
//        print data via variable
        String upper = upperCaseString.toLowerCase();
        System.out.println(upper);
        System.out.println(upperCaseString);
//        print data directly
        System.out.println(upperCaseString.toLowerCase());

        String lowerCaseString = "java";
        System.out.println(lowerCaseString);
        System.out.println(lowerCaseString.toUpperCase());




    }
}