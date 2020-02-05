package com.sparta.gwilymt;

public class DuplicateRemover {
    public static <T> T[] removeDuplicates(T[] array) {
        if(array[0] instanceof Boolean || array[0] instanceof Double || array[0] instanceof Float){
            System.out.println("This system only accepts Integers, Characters and Strings.");
            return null;
        }
        for (int i  = 0; i < array.length; i++){
            for(int j = i; j <array.length; j++){
                if (i != j){
                    if(array[i] != null && array[j] != null && array[i].equals(array[j])){
                        array[j] = null;
                    }
                }
            }
        }
        return array;
    }
}