package HW_1;

public interface Competitor {
    void run(int runDistance);
    void swim(int swimDistance);
    void jump(float height);
    boolean isOnDistance();
    void info();
}
