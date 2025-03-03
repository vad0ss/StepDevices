public class Smartphone extends Device implements Chargeable {

    private int cameraResolution;

    public Smartphone(String serialNumber, String model, int cameraResolution) {
        super(serialNumber, model, 0);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone {" +
                "cameraResolution=" + cameraResolution +
                '}';
    }

    @Override
    public Device clone() {
        return new Smartphone(this.getSerialNumber(), this.getModel(), this.cameraResolution);
    }

    public void charge(int charge) {
        int level = this.getBatteryLevel() + charge;

        if (level <= 100) {
            this.setBatteryLevel(level);
        } else {
            this.setBatteryLevel(100);
        }
    }
}
