package electronicDevice;

public abstract class DeviceMobile implements Device {
    private String status;


    public DeviceMobile(String status) {
        this.status = status;
    }

    public DeviceMobile() {

    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("  Statusul dispozitivolui :: " + status);
    }
}
