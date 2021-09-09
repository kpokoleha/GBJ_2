package HW_2;

public class Main {

    public static void main(String[] args) {
        String[][] myArray = new String[][]{
                {"1", "3", "5", "7"},
                {"2", "4", "6", "8"},
                {"3", "5", "7", "9"},
                {"4", "6", "з", "0"}
        };
        try{
            try {
                int sum = sumOfArray(myArray);
                System.out.println("Сумма элементов: " + sum);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
                e.printStackTrace();
                }
            }
            catch (MyArrayDataException e) {
                System.out.println("Неверный формат данных!");
                System.out.println("Ошибка в ячейке: " + (e.i + 1) + "x" + (e.j + 1));
                e.printStackTrace();
            }
            //команда, которая выполняется всегда после выполнения try и catch
            finally {
            System.out.println("*Проверка завершена*");
        }
    }
    public static int sumOfArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        //проходит по массиву
        if (myArray.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    //переводит String в Int и суммируем элементы
                    count = count + Integer.parseInt(myArray[i][j]);
                }
                catch (NumberFormatException e) { //проверяет формат данных
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
    //создаем исключения
    public static class MyArrayDataException extends Exception {
        public int i;
        public int j;

        MyArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;

        }
    }
    public static class MyArraySizeException extends Exception {

    }
}
