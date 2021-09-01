package Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void addNewData(ArrayList database, int data){
        database.add(data);
    }
    public static void main(String[] args) {
//**        File file = new File("text.txt");
//**        PrintWriter printWriter = new PrintWriter("text.txt");

//        ArrayList<Integer> data = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);

//        int a = 0;
//        int b = 5;

//        int[] a = {3, 0 , 2, 1, 5};
//
//
////        while (true){
//        try {
////                addNewData(data, sc.nextInt());
//
////                System.out.println(b/a);
//
//            System.out.println(a[6]);
//            System.out.println(a[0]/a[1]);
//
//        }
//
//        catch(ArithmeticException e){
////                System.out.println("Не удалось добавить данные");
//
//            System.out.println("Не удалось выполнить действие");
//            e.printStackTrace();//метод выводит системную информацию об ошибке
//        }
//
//        catch (IndexOutOfBoundsException e){
//            System.out.println("Мы вышли за пределы массива");
//            e.printStackTrace();
//        }
//
//        System.out.println("Исключения все обработались");
//        System.out.println("Работаем дальше");
////        }
//
////        RunTimeException.getIndexOutOfBoundException();
////    }
////    static class RunTimeException{
////        //вызов ошибки "обращение к индексу массива, которого в нем нет
////        public static void getIndexOutOfBoundException(){
////            int[] a = {1, 2, 3};
////            System.out.println(a[5]);
////        }
//**        int a = 5;
//**       a += 95;
//**        if ( a > 99 ) {
//**            try {
//**                throw new ArithmeticException(); //проброс исключения, можно его перехватить
//**            } catch (ArithmeticException e){
//**                System.out.println("Проблемы с математикой");
//**                e.printStackTrace();
//**            }
//**        }

//        try {
//            System.out.println(5/0);
//           } catch (ArithmeticException e){
//                System.out.println("Проблемы с математикой");
//
//           }
//        finally {
//            //блок, который выполняется всегда
//            System.out.println("Работаем дальше");
//        }

        int [] i = {3, 4, 5};
        try {
            checkArraySize(i);

        } catch (Exception e){
            System.out.println("Проблемы с математикой");
            e.printStackTrace();

        }
        finally {
            //блок, который выполняется всегда
            System.out.println("Работаем дальше");
        }
    }

    public static void checkArraySize(int[] a) throws ArrayException {
        if (a.length != 4) {
            throw new ArrayException();

        }
    }
    //создание собственного исключения - класса
    public static class ArrayException extends Exception{

    }
}