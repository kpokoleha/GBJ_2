package HW_1.Disciplines;

import HW_1.Competitor;

public class Running extends Discipline {
    int length;

    public Running(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}