package HW_3;

import java.util.LinkedList;

public class SwapArrayElements {


    public static void main(String[] args) {
        //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        LinkedList<String> myArray = new LinkedList<>();
        myArray.add("A");
        myArray.add("B");
        myArray.add("C");
        myArray.add("D");
        myArray.add("E");
        myArray.add("F");
        swapArray(myArray);
    }

    private static void swapArray(LinkedList<String> myArray) {
        System.out.println("My array: " + myArray);
        String val1 = myArray.get(3);
        String val2 = myArray.get(4);
        myArray.set(4, val1);
        myArray.set(3, val2);
        System.out.println("My new array: " + myArray);
    }
}
