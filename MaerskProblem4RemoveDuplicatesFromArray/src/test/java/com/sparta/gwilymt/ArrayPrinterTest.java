package com.sparta.gwilymt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayPrinterTest {
    //Test arrays
    private String[] stringArray = {"cat", "cat", "dog", "fish", "dog", "cow"};
    private Integer[] intArray = {1, 2, 2, 3, 1, 5};
    private Character[] characterArray = {'a', 'a', 'b', 'c', 'b', 'd', 'a'};
    private Double[] doubleArray = {22.4, 1.5, 7.4, 26.4, 86.3};
    private Float[] floatArray = {2.4f, 20.3f, 2.4f, 1.5f, 3.5f, 3.5f};
    private Boolean[] booleanArray = {true, true, false, true, false};
    //Expected arrays
    private String[] expectedStringArray = {"cat", null, "dog", "fish", null, "cow"};
    private Integer[] expectedIntArray = {1, 2, null, 3, null, 5};
    private Character[] expectedCharacterArray = {'a', null, 'b', 'c', null, 'd', null};
    //String Tests
    @Test
    void testThatArrayPrinterAcceptsStrings(){
        Assertions.assertTrue(ArrayPrinter.printArray(stringArray));
    }
    //Integer Tests
    @Test
    void testThatArrayPrinterAcceptsIntegers(){
        Assertions.assertTrue(ArrayPrinter.printArray(intArray));
    }
    //Character Tests
    @Test
    void testThatArrayPrinterAcceptsCharacters(){
        Assertions.assertTrue(ArrayPrinter.printArray(characterArray));
    }
    //Double Tests
    @Test
    void testThatArrayPrinterDoesNotAcceptDouble(){
        Assertions.assertFalse(ArrayPrinter.printArray(doubleArray));
    }
    //Float Tests
    @Test
    void testThatArrayPrinterDoesNotAcceptFloat(){
        Assertions.assertFalse(ArrayPrinter.printArray(doubleArray));
    }
    @Test
    void testThatArrayPrinterDoesNotAcceptBoolean(){ Assertions.assertFalse(ArrayPrinter.printArray(booleanArray));}
}
