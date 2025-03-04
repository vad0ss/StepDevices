public class Smartphone extends Device implements Chargeable {

    private int cameraResolution;

    public Smartphone(String serialNumber, String model, int cameraResolution) {
        super(serialNumber, model, 50);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + this.getModel() + ", серийный номер: " + this.getSerialNumber() + ", камера: " + this.cameraResolution + ", заряд: " + this.getBatteryLevel() + "%";
    }

    @Override
    public Device clone() {
        return new Smartphone(this.getSerialNumber(), this.getModel(), this.cameraResolution);
    }


    public void charge(int amount) {
        int level = this.getBatteryLevel() + amount;

        if (level <= 100) {
            this.setBatteryLevel(level);
        } else {
            this.setBatteryLevel(100);
        }
    }
}
