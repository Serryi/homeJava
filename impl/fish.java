import homeTask.Animal;
import homeTask.Swimmable;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, String color) {
        super(name, color,0);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("не издаю звуков");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 45;
    }
}
