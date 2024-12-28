package electronicDevice;

public class Printer {
    public static void main(String[] args) {
        DeviceMobile telephone = new Telephone();
        DeviceMobile tablet = new Tablet();

        telephone.start();
        telephone.stop();
        System.out.println();
        tablet.start();
        tablet.stop();
    }
}
