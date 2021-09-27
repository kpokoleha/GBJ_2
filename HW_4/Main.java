package HW_4;

import java.util.*;

public class Main {
    public static void main(String[] args){

        //*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        //*   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        //*   Посчитать, сколько раз встречается каждое слово.
        List<String> list = new ArrayList<String>(Arrays.asList("Bosch", "Siemens", "Electrolux", "Miele", "Thomas",
                "Karcher", "Rowenta", "Thomas", "Kaiser", "Karcher",
                "Bosch", "Thomas", "Siemens", "Karcher", "Kaiser",
                "Electrolux", "Bosch", "Subaru", "Bosch", "Siemens"));

        Set<String> unique = new HashSet<String>(list);

        System.out.println("*** Исходный массив ***");
        System.out.println(list.toString());

        System.out.println("\n*** Уникальные слова ***");
        System.out.println(unique.toString());

        System.out.println("\n*** Частота встречаемости слова ***");
        for (String word : unique) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }

        //* 2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
        //*    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        //*    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        System.out.println("\n*** Телефонный справочник ***");
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов","8(999)888 77 66");
        phonebook.add("Петров","8(999)777 66 55");
        phonebook.add("Сидоров","8(999)666 55 44");
        phonebook.add("Бубнов","8(999)555 44 33");
        phonebook.add("Смирнов","8(999)444 33 22");

        System.out.println("\n*** Вывод номеров ***");
        System.out.println("Иванов " + phonebook.get("Иванов"));
        System.out.println("Петров " + phonebook.get("Петров"));
        System.out.println("Сидоров " + phonebook.get("Сидоров"));
        System.out.println("Смирнов " + phonebook.get("Смирнов"));
        System.out.println("Бубнов " + phonebook.get("Бубнов"));

        System.out.println("\n*** Проверка невнесенного номера ***");
        System.out.println("Цветков " + phonebook.get("Цветков"));

        System.out.println("\n*** Попытка внести существующий номер ***");
        phonebook.add("Иванов", "8(999)888 77 66");
        System.out.println(phonebook.get("Иванов"));
    }
}