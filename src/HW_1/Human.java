package HW_1;

public class Human implements Competitor {

    String name;
    int maxRunDistance;
    float maxJumpHeight;
    int maxSwimDistance;
    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 1.8f;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    @Override
    public void run(int runDistance) {
        System.out.println("\n ***** Результат участника " + name + " *****");
        if (runDistance <= maxRunDistance) {
            System.out.println(name + " успешно справился с дистанцией в " + runDistance + " м.");
        } else {
            System.out.println(name + " не смог пройти дистанцию в " + runDistance + " м.");
            active = false;
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= maxSwimDistance) {
            System.out.println(name + " успешно проплыл дистанцию в " + swimDistance + " м.");
        } else {
            System.out.println(name + " не смог проплыть дистанцию в " + swimDistance + " м.");
            active = false;
        }
    }

    @Override
    public void jump(float height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно преодолел барьер в " + height + " м.");
        } else {
            System.out.println(name + " не смог преодолеть барьер в " + height + " м.");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}
