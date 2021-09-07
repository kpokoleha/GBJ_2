package HW_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T extends Fruit> {

    public List<T> getList() {
        return list;
    }

    private List<T> list;

    public Box(T object) {
        list = Arrays.asList(object);
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void add(T object) {
        list.add(object);
    }

    void moveAt(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    public void boxInfo() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста.");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " " + list.size() + " шт.");
        }
    }

    public float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}