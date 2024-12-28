package animal;

public class Printer {
    public static void main(String[] args) {
        Mammal cat = new Cat(" Thomas","pisica","miau miau");
        Mammal dog = new Dog(" Sharic" ," ciine ","ham ham");

        cat.makeSound();
        System.out.println(cat.lactation()  + ((Cat)cat).getRace());
        cat.sleep();
        System.out.println();

        dog.makeSound();
        System.out.println(dog.lactation() + ((Dog)dog).getRace());
        dog.sleep();
    }
}
