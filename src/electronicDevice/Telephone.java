package electronicDevice;

public class Telephone extends DeviceMobile implements Device{
    public Telephone(String status) {
        super(status);
    }

    public Telephone() {
        super();
    }

    @Override
    public void start() {
        System.out.println("  Telefonul se porneste.");
        setStatus("  pornit ");
    }

    @Override
    public void stop() {
        System.out.println("  Telefonul se inchide.");
        setStatus("  oprit ");
    }
}
