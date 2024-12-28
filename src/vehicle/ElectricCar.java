package vehicle;

public class ElectricCar extends Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("  Masina electrica acceleraza silentios.");
    }
}
