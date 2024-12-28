package vehicle;

public class Printer {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar();
        Car motorCar = new MotorCar();

        electricCar.accelerate();
        electricCar.stop();

        motorCar.accelerate();
        motorCar.stop();
    }
}
