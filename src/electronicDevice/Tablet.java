package electronicDevice;

public class Tablet extends DeviceMobile implements Device{

    @Override
    public void start() {
        System.out.println("  Tableta se porneste.");
        setStatus("  pornit ");
    }

    @Override
    public void stop() {
        System.out.println("  Tableta se inchide.");
        setStatus("  oprit ");
    }
}
