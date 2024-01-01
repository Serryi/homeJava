import java.util.ArrayList;
import java.util.List;

import homeTask.impl.*;
import homeTask.impl.Doctor;
import homeTask.veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new cat("Архип"))
                .addAnimal(new dog("Анфиса"))
                .addAnimal(new duck("Пётр"))
                .addAnimal(new bird("Боря"))
                .addAnimal(new fish("Евгений"))
  
        Doctor merlova = new Doctor("Ведрев Еремей Тузович");
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(merlova);
     

        System.out.println("Все животные:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nБегающие животные:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + ", " + "Скорость: " + r.getRunningSpeed());
        }

        System.out.println("\nПлавающие животные:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + ", " + "Скорость: " + s.getSwimmingSpeed());
        }

        System.out.println("\nЛетающие животные:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + ", " + "Скорость: " + f.getFlightSpeed());
        }

        System.out.println("\nГоворящие животные:");
        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nГлавный ветиринарный врач:");
        System.out.println(doctors);
    
    }

}
