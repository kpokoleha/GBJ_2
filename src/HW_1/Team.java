package HW_1;

public class Team {
    String nameOfTeam ;
    Competitor[] membersOfTeam = new Competitor[3];
    // Формируем команду
    public Team(String nameTeam, Competitor c1, Competitor c2, Competitor c3 ) {
        this.nameOfTeam  = nameTeam;

        membersOfTeam[0] = c1;
        membersOfTeam[1] = c2;
        membersOfTeam[2] = c3;
    }
    // Вывод информации кто прошел дистанцию
    public void passedTheDistance() {
        for (Competitor c : membersOfTeam) {
            // Если участник onDistance == true, выводим его
            if (c.isOnDistance()) {
                c.info();
            }
        }
    }

    // Вывод информации о членах команды
    public void showResults() {
        for (Competitor c : membersOfTeam) {
            c.info();
        }
    }

    // геттер участников команды
    public Competitor[] getMembersOfTeam() {
        return membersOfTeam;
    }
}