public class ArrayObjClass {
    public static void main(String[] args) {
        Student[] studentsArray = new Student[10];
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.print(studentsArray[i] + " ");
        }

        Student[] studentsLiteral = new Student[] {
                new Student("Alex"),
                new Student("Max"),
                new Student("Bob")
        };

        System.out.println();
        for (int i = 0; i < studentsLiteral.length; i++) {
            System.out.print(studentsLiteral[i] + " ");
        }
    }
}
