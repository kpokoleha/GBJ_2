package HW_3;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("**** Коробки с фруктами ****");
        orangeBox1.boxInfo();
        orangeBox2.boxInfo();
        appleBox.boxInfo();

        float orange1Weigth = orangeBox1.getWeight();
        float orange2Weigth = orangeBox2.getWeight();
        float appleWeigth = appleBox.getWeight();

        System.out.println("\n**** Вес коробок с фруктами ****");
        System.out.println("Вес Коробки №1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес Коробки №2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес Коробки №1 с яблоками: " + appleWeigth);

        System.out.println("\n**** Сравнение веса коробок с фруктами ****");
        System.out.println("Вес Коробки №1 с апельсинами  и Коробки №1 с яблоками одинаковый? - " + orangeBox1.compare(appleBox));
        System.out.println("Вес Коробки №2 с апельсинами и Коробки №1 с яблоками одинаковый? - " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        System.out.println("\n**** Коробки с фруктами - итог ****");
        orangeBox1.boxInfo();
        orangeBox2.boxInfo();
        appleBox.boxInfo();
    }
}
