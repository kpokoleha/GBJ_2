package HW_1;

import HW_1.Disciplines.Discipline;

public class Course {
    Discipline[] course = new Discipline[3];
    // Создаем полосу препятствий
    public Course(Discipline d1, Discipline d2, Discipline d3) {
        course[0] = d1;
        course[1] = d2;
        course[2] = d3;
    }

    // Метод, который просит всю команду пройти полосу препятствий
    public void doIt(Team t) {
        System.out.println("Команды участники: " + t.nameOfTeam + "\n");
        // Для каждого участника команды
        for (Competitor com : t.getMembersOfTeam()) {
            // Для каждого препятствия вызываем метод его прохождения текущим участником команды
            for (Discipline b: course) {
                b.doIt(com);
            }
        }
    }
}