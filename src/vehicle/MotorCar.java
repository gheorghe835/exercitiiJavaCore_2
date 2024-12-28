package vehicle;

public class MotorCar extends Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("  Masina acceleraza cu zgomot.");
    }
}
