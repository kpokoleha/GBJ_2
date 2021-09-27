package HW_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    public HashMap<String, List<String>> book;
    public Phonebook(){
        this.book = new HashMap<>();

    }
    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println("Номер " + number +  " добавлен для фамилии " + surname);
            } else {
                System.out.println("Номер " + number + " уже существует для фамилии " + surname);
            }
        } else {
            book.put(surname, new ArrayList<String>(Arrays.asList(number)));
            System.out.println("Номер " + number +  " добавлен для фамилии " + surname);
        }
    }
    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println("В справочнике нет записи для фамилии " + surname);
            return new ArrayList<>();
        }
    }


}
