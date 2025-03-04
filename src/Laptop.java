public class Laptop extends Device implements Chargeable {

    private int batteryLife;

    public Laptop(String serialNumber, String model, int batteryLife) {
        super(serialNumber, model, 30);
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return super.toString() + this.getModel() + ", серийный номер: " + this.getSerialNumber() + ", время работы от батареи: " + this.batteryLife + " часов, заряд: " + this.getBatteryLevel() + "%";
    }

    @Override
    public Device clone() {
        return new Laptop(this.getSerialNumber(), this.getModel(), this.batteryLife);
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

