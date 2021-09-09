package HW_3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> myArray = new LinkedList<>();
        myArray.add("A");
        myArray.add("B");
        myArray.add("C");
        myArray.add("D");
        myArray.add("E");
        myArray.add("F");
        swapArray(myArray);


        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        for (int i = 0; i < 10; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 13; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 15; i++) {
            appleBox.add(new Apple());
        }

        System.out.println("\nЗадание 2");
        System.out.println("**** Коробки с фруктами ****");
        orangeBox1.boxInfo();
        orangeBox2.boxInfo();
        appleBox.boxInfo();

        float orangeBox1Weight = orangeBox1.getWeight();
        float orangeBox2Weight = orangeBox2.getWeight();
        float appleWeight = appleBox.getWeight();

        System.out.println("\n**** Вес коробок с фруктами ****");
        System.out.println("Вес Коробки №1 с апельсинами: " + orangeBox1Weight);
        System.out.println("Вес Коробки №2 с апельсинами: " + orangeBox2Weight);
        System.out.println("Вес Коробки №1 с яблоками: " + appleWeight);

        System.out.println("\n**** Сравнение веса коробок с фруктами ****");
        System.out.println("Вес Коробки №1 с апельсинами  и Коробки №1 с яблоками одинаковый? - " + orangeBox1.compare(appleBox));
        System.out.println("Вес Коробки №2 с апельсинами и Коробки №1 с яблоками одинаковый? - " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        System.out.println("\n**** Коробки с фруктами - итог ****");
        orangeBox1.boxInfo();
        orangeBox2.boxInfo();
        appleBox.boxInfo();
    }

    private static void swapArray(LinkedList<String> myArray) {
        System.out.println("Задание 1");
        System.out.println("**** Исходный массив **** \n" + myArray);
        String val1 = myArray.get(3);
        String val2 = myArray.get(4);
        myArray.set(4, val1);
        myArray.set(3, val2);
        System.out.println("**** Модифицированный массив **** \n" + myArray);
    }
}
