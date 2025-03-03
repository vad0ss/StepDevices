import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<Device>();
        Smartphone phone = new Smartphone("123-456-789", "Galaxy S21", 108);
        Device phone1 = phone.clone();

        devices.add(phone);

        System.out.println(phone.hashCode());
        System.out.println(phone1.hashCode());

    }
}