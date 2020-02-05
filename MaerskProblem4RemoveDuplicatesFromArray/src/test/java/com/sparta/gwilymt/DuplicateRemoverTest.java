package com.sparta.gwilymt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateRemoverTest {
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
    void testThatDuplicatesAreRemovedFromStringArray(){
        String[] testResult = DuplicateRemover.removeDuplicates(stringArray);
        Assertions.assertArrayEquals(expectedStringArray, testResult);
    }
    //Integer Tests
    @Test
    void testThatDuplicatesAreRemovedFromIntArray(){
        Integer[] testResult = DuplicateRemover.removeDuplicates(intArray);
        Assertions.assertArrayEquals(expectedIntArray, testResult);
    }
    //Character Tests

    @Test
    void testThatDuplicatesAreRemovedFromCharacterArray(){
        Character[] testResult = DuplicateRemover.removeDuplicates(characterArray);
        Assertions.assertArrayEquals(expectedCharacterArray, testResult);
    }
    //Double Tests
    @Test
    void testThatRemoveDuplicatesDoesNotAcceptDouble(){
        Double[] testResult = DuplicateRemover.removeDuplicates(doubleArray);
        Assertions.assertArrayEquals(null, testResult);
    }
    //Float Tests
    @Test
    void testThatRemoveDuplicatesDoesNotAcceptFloat(){
        Float[] testResult = DuplicateRemover.removeDuplicates(floatArray);
        Assertions.assertArrayEquals(null, testResult);
    }
    //Boolean Test
    @Test
    void testThatRemoveDuplicatesDoesNotAcceptBoolean(){
        Boolean[] testResult = DuplicateRemover.removeDuplicates(booleanArray);
        Assertions.assertArrayEquals(null, testResult);
    }

}