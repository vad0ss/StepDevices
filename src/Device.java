import java.util.Objects;

public abstract class Device {

    private final String serialNumber;
    private String model;
    private static int totalDevices;
    private int batteryLevel;

    public Device(String serialNumber, String model, int batteryLevel) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.totalDevices++;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public String toString() {
        return "Device{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", batteryLevel=" + batteryLevel +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    public abstract Device clone();

}
