package Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void addNewData(ArrayList database, int data){
        database.add(data);
    }
    public static void main(String[] args) {
//        ArrayList<Integer> data = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);

//        int a = 0;
//        int b = 5;

        int[] a = {3, 0 , 2, 1, 5};




//        while (true){
            try {
//                addNewData(data, sc.nextInt());

//                System.out.println(b/a);

                System.out.println(a[6]);
                System.out.println(a[0]/a[1]);

            }

            catch(ArithmeticException e){
//                System.out.println("Не удалось добавить данные");

                System.out.println("Не удалось выполнить действие");
                e.printStackTrace();//метод выводит системную информацию об ошибке
            }

            catch (IndexOutOfBoundsException e){
                System.out.println("Мы вышли за пределы массива");
                e.printStackTrace();

            }
        System.out.println("Исключения все обработались");
        System.out.println("Работаем дальше");
//        }

//        RunTimeException.getIndexOutOfBoundException();
//    }
//    static class RunTimeException{
//        //вызов ошибки "обращение к индексу массива, которого в нем нет
//        public static void getIndexOutOfBoundException(){
//            int[] a = {1, 2, 3};
//            System.out.println(a[5]);
//        }
    }
}
