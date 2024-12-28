package animal;

public class Dog extends Mammal implements Animal{
    private String name;
    private String race;
    private  String sound;
    private  String sleeps;

    public Dog(String name, String race, String sound) {
        this.name = name;
        this.race = race;
        this.sound = sound;
        this.sleeps = null;
    }

    public String getRace() {
        return race;
    }

    @Override
    public void makeSound() {
        System.out.println("  Animalul:: " + name + ", de rasa " + race + ", face:: " + sound);
    }

    @Override
    public void sleep() {
        System.out.println(" " + name + " doarme afara. " );
    }
}
