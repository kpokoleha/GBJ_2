package Lesson3;

//public class Main {
//
//    //1. Создаем класс Box
//    public static class Box{
//
//        //2. Создаем объект с именем object типа Object
//        private Object object;
//
//        //4. Создаем метод
//        public Box(Object object){
//            this.object = object; //значению объекта, принадлежащего классу, присвоим то, что ему передали
//        }
//
//        //3. Создаем гетеры и сеттеры, которые позволяют обращаться к приватному полю object
//        public Object getObject() {
//            return this.object;
//        }
//
//        public void setObject(Object object) {
//            this.object = object;
//        }
//
//        //5. Переопределяем метод
//        @Override
//        public String toString(){
//            return "Box: "
//                    + "type "+ this.object.getClass().getSimpleName() //делает название полученного класса короче
//                    + " object " + this.object;
//        }
//    }
//
//    public static void main(String[] args) {
//        //6. Создаем коробки разного типа
//        Box box1 = new Box(10);
//        Box box2 = new Box("Hello");
//
//        //8. Создадим 3ю коробку
//        Box box3 = new Box(15);
//
//        //10.
//        int result;
//
////        //7. Выводим информацию о коробках
////        System.out.println(box1.toString());
////        System.out.println(box2.toString());
//
////        //9. Получение суммы двух коробок
////        int result = (Integer)box1.getObject() + (Integer)box3.getObject(); //воспользовались приведением типов
////        System.out.println(result);
//
//        //10. Проверка на соответствие типов друг другу
//        if (box1.getObject() instanceof Integer && box2.getObject() instanceof Integer); //двойная проверка
//        result = (Integer)box1.getObject() + (Integer)box3.getObject();
//    }
//}


//11. Работа с обобщениями - когда мы не знаем, какой тп будет у нашего класса
//public class Main {
//    //1. Все объекты Box будут обобщенного типа T - TYPE
//    public static class Box<T> {
//
//        //2. Создаем объект с именем object типа T
//        private T object;
//
//        //4. Создаем метод
//        public Box(T object) {
//            this.object = object; //значению объекта, принадлежащего классу, присвоим то, что ему передали
//        }
//
//        //3. Создаем гетеры и сеттеры, которые позволяют обращаться к приватному полю object
//        public T getObject() {
//            return this.object;
//        }
//
//        public void setObject(T object) {
//            this.object = object;
//        }
//
//        //5. Переопределяем метод
//        @Override
//        public String toString() {
//            return "Box: "
//                    + "type " + this.object.getClass().getSimpleName() //делает название полученного класса короче
//                    + " object " + this.object;
//        }
//    }
//
//    public static void main(String[] args) {
//        //6. Создаем коробки с указанием типов
//        Box<Integer> box1 = new Box<>(10);
//        Box<Integer> box2 = new Box<>(10);
//
//        //7. Получение суммы двух коробок
//        int result = box1.getObject() + box2.getObject();
//        System.out.println(result);
//
//    }
//}

//12. Работа с ограничениями на типах
//public class Main {
//    //1. Все объекты Box будут обобщенного типа T - TYPE - наследованный у типа Number
//    public static class Box<T extends Number> {
//
//        //2. Создаем объект с именем object типа T
//        private T object;
//
//        //4. Создаем метод
//        public Box(T object) {
//            this.object = object; //значению объекта, принадлежащего классу, присвоим то, что ему передали
//        }
//
//        //3. Создаем гетеры и сеттеры, которые позволяют обращаться к приватному полю object
//        public T getObject() {
//            return this.object;
//        }
//
//        public void setObject(T object) {
//            this.object = object;
//        }
//
//        //5. Переопределяем метод
//        @Override
//        public String toString() {
//            return "Box: "
//                    + "type " + this.object.getClass().getSimpleName() //делает название полученного класса короче
//                    + " object " + this.object;
//        }
//    }
//
//    public static void main(String[] args) {
//        //6. Создаем коробки с указанием типов
//        Box<Integer> box1 = new Box<>(10);
//        Box<Float> box2 = new Box<>(10f);
//
//        //* при таком наследовании программа не позволит создать объект типа String
//        //Box<String> box3 = new Box<>(10);
//
//        //7. Получение суммы двух коробок
//        int result = (int) (box1.getObject() + box2.getObject());
//        System.out.println(result);
//
//    }
//}
//13. Множественные обобщения
//public class Main {
//    //1. Все объекты Box будут обобщенного типа T - TYPE - наследованный у типа Number
//    public static class Box<T extends Number, U> {
//
//        //2. Создаем объект с именем object типа T
//        private T object;
//        private U object2;
//
//        //4. Создаем метод
//        public Box(T object, U object2) {
//            this.object = object; //значению объекта, принадлежащего классу, присвоим то, что ему передали
//            this.object2 = object2;
//        }
//
//        //3. Создаем гетеры и сеттеры, которые позволяют обращаться к приватному полю object
//        public T getObject() {
//            return this.object;
//
//        }
//
//        public void setObject(T object) {
//            this.object = object;
//        }
//
//        //5. Переопределяем метод
//        @Override
//        public String toString() {
//            return "Box: "
//                    + "type " + this.object.getClass().getSimpleName() //делает название полученного класса короче
//                    + " object " + this.object
//                    + " " + this.object2;
//        }
//    }
//
//    public static void main(String[] args) {
//        //6. Создаем коробки с указанием типов
//        Box<Integer, String> box1 = new Box<>(10,"Hello");
//        Box<Float, String> box2 = new Box<>(1.2f, "Hi");
//
//
//        //7. Выводим информацию о коробках
//        System.out.println(box1.toString());
//        System.out.println(box2.toString());
//        //* при таком наследовании программа не позволит создать объект типа String
//        //Box<String> box3 = new Box<>(10);
//
//        //7. Получение суммы двух коробок
//        float result = (box1.getObject() + box2.getObject());
//        System.out.println(result);
//
//    }
//}

//13.
public class Main {

    //несколько параметров
    public interface Connector<T, U>{
        public void doSmt(T obj, U obj2);
    }

    //1. Все объекты Box будут обобщенного типа T - TYPE - наследованный у типа Number
    public static class Box<T extends Number> {

        //2. Создаем объект с именем object типа T
        private T object;


        //4. Создаем метод
        public Box(T object) {
            this.object = object; //значению объекта, принадлежащего классу, присвоим то, что ему передали
        }

        //3. Создаем гетеры и сеттеры, которые позволяют обращаться к приватному полю object
        public T getObject() {
            return this.object;

        }

        public void setObject(T object) {
            this.object = object;
        }

        //5. Переопределяем метод
        @Override
        public String toString() {
            return "Box: "
                    + "type " + this.object.getClass().getSimpleName() //делает название полученного класса короче
                    + " object " + this.object;
        }
    }

    public static void main(String[] args) {
        //6. Создаем коробки с указанием типов
        Box<Integer> box1 = new Box<>(10);
        Box<Float> box2 = new Box<>(1.2f);

        double a = (Integer) 5 + (Double) 2.1;


        //7. Выводим информацию о коробках
        System.out.println(box1.toString());
        System.out.println(box2.toString());
        //* при таком наследовании программа не позволит создать объект типа String
        //Box<String> box3 = new Box<>(10);

        //7. Получение суммы двух коробок
        float result = (box1.getObject() + box2.getObject());
        System.out.println(result);

    }
}

