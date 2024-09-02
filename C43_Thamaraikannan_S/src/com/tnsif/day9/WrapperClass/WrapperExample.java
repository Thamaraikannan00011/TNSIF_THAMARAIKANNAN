package com.tnsif.day9.WrapperClass;

public class WrapperExample {
    public static void main(String[] args) {
        // Using wrapper classes to convert primitive types to objects
        
        // Creating an Integer object from an int primitive
        int primitiveInt = 10;
        Integer integerObject = Integer.valueOf(primitiveInt); // Auto-boxing

        // Creating a Double object from a double primitive
        double primitiveDouble = 20.5;
        Double doubleObject = Double.valueOf(primitiveDouble); // Auto-boxing

        // Converting wrapper objects back to primitive types
        int intFromObject = integerObject.intValue(); // Unboxing
        double doubleFromObject = doubleObject.doubleValue(); // Unboxing

        // Printing values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Integer object: " + integerObject);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Double object: " + doubleObject);
        System.out.println("Unboxed int: " + intFromObject);
        System.out.println("Unboxed double: " + doubleFromObject);
    }
}
