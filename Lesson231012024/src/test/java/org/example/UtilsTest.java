package org.example;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    int[] arr;
    int[] arrNum;

//    @BeforeAll
//    static void initBeforeAll() {
//        System.out.println("From initBeforeAll");
//    }
//
//    @AfterAll
//    static void closeAfterAll() {
//        System.out.println("From closeAfterAll");
//    }

    @BeforeEach
    void init() {
        arr = new int[]{1, 2, 3};
//        System.out.println("From BeforeEach");
        arrNum = new int[]{0, 100, -10, 234, 11, 1234};

    }

    @AfterEach
    void close() {
//        System.out.println("From AfterEach");
    }

    @Test
    void getNumbersSuccessTest() {
//        assertEquals(arr, Utils.getNumbers());
        assertArrayEquals(arr, Utils.getNumbers());
//        System.out.println("From getNumbersSuccessTest");
    }

    @Test
    void getNumbersNotNullTest() {
//        assertNotNull(arr);
        assertNotNull(Utils.getNumbers());
//        System.out.println("From getNumbersNotNullTest");
    }

    @Test
    void checkAssertNullTest() {
        assertNull(null);
    }

    @Test
    void findMaxIsNotNullTest() {
        assertNotNull(Utils.findMax(arrNum));
    }

    @Test
    void findMaxCorrectValueTest() {
        int value = 1234;
        assertEquals(value, Utils.findMax(arrNum));
    }
}