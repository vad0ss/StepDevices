public class DeviceManager {

    public static void printDevice(Device device) {
        System.out.println(device);
    }

    public static void printDevice(Device[] devices) {
        System.out.println(devices);
    }

    public static int getTotalDevices() {
        return Device.getTotalDevices();
    }

    public static void chargeDevice(Chargeable device, int amount) {
        device.charge(amount);
    }

    public static void chargeDevice(Chargeable[] devices, int amount) {
        for (Chargeable device : devices) {
            device.charge(amount);
        }
    }

}
