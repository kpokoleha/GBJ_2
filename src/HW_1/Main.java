package HW_1;

import HW_1.Disciplines.Jumping;
import HW_1.Disciplines.Running;
import HW_1.Disciplines.Swimming;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Running(500), new Swimming(150), new Jumping(0.5f)); // Создаем полосу препятствий
        Team team = new Team("Банда", new Human("Иван"), new Cat("Жоржик"), new Dog("Шарик")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу

        System.out.println("\nПобедители:");
        team.passedTheDistance();

        System.out.println("\nРезультаты прохождения всех дисциплин:");// Показываем результаты
        team.showResults();
    }
}
