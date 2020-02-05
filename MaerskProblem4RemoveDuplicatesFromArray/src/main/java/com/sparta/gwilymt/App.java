package com.sparta.gwilymt;

public class App
{
    public static void main( String[] args ) {
        Integer[] intArray = {1, 2, 2, 3, 1, 5};
        String[] stringArray = {"cat", "cat", "dog", "fish", "dog", "cow"};
        Character[] characterArray = {'a', 'a', 'b', 'c', 'b', 'd', 'a'};
        DuplicateRemover.removeDuplicates(intArray); //Expected: 1, 2, 3,
        ArrayPrinter.printArray(intArray);
        DuplicateRemover.removeDuplicates(stringArray); //Expected: cat, dog, fish, cow,
        ArrayPrinter.printArray(stringArray);
        DuplicateRemover.removeDuplicates(characterArray);//Expected: a, b, c, d,
        ArrayPrinter.printArray(characterArray);
    }
}