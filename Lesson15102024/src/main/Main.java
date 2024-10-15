package main;

import tasks.Test;
import tasks.sub_task.SubTest;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        SubTest subTest = new SubTest();

        System.out.println(test.name);
//        System.out.println(subTest.name);
    }
}
