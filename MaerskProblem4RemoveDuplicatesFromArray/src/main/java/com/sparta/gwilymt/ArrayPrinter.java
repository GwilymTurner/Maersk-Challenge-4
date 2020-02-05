package com.sparta.gwilymt;

public class ArrayPrinter {
    public static <T> boolean printArray(T[] array){
        if(array[0] instanceof Boolean || array[0] instanceof Double || array[0] instanceof Float){
            System.out.println("This system only accepts Integers, Characters and Strings.");
            return false;
        }
        for (T t : array) {
            if (t != null) {
                System.out.print(t + ", ");
            }
        }
        System.out.println();
        return true;
    }
}
