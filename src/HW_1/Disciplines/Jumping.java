package HW_1.Disciplines;

import HW_1.Competitor;

public class Jumping extends Discipline {
    float height;

    public Jumping(float height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
