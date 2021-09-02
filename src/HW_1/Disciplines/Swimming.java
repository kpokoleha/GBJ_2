package HW_1.Disciplines;

import HW_1.Competitor;

public class Swimming extends Discipline {
    int length;

    public Swimming(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
