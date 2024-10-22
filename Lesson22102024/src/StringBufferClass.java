public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("It is String Builder Object");
        System.out.println(stringBuffer);

        stringBuffer.replace(13, 20, "Buffer");

        System.out.println("After replacing string buffer = " + stringBuffer);
    }
}
