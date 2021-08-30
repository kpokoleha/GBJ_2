package HW_1;

public class Animal implements Competitor {

    String type;
    String name;
    int maxRunDistance;
    float maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, float maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int runDistance) {
        System.out.println("\n ***** Результат участника " + name + " *****");
        if (runDistance <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно справился с дистанцией в " + runDistance + " м.");
        } else {
            System.out.println(type + " " + name + " не смог пройти дистанцию в " + runDistance + " м.");
            onDistance = false;
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать.");
            onDistance = false;
            return;
        }
        if (swimDistance <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыл дистанцию в " + swimDistance + " м.");
        } else {
            System.out.println(type + " " + name + " не смог проплыть дистанцию в " + swimDistance + " м.");
            onDistance = false;
        }
    }

    @Override
    public void jump(float height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно преодолел барьер в " + height + " м.");
        } else {
            System.out.println(type + " " + name + " не смог преодолеть барьер в " + height + " м.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}