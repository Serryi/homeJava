import homeTask.Animal;
import homeTask.Flyable;
import homeTask.Runnable;
import homeTask.Swimmable;

public class Duck extends Animal implements Flyable, Runnable, Swimmable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кря");
    }

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 60;
    }

    @Override
    public int getRunningSpeed() {
        return 10;
    }

    @Override
    public int getSwimmingSpeed() {
        return 3;
    }
}
