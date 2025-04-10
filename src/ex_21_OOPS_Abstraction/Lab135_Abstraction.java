package ex_21_OOPS_Abstraction;

public class Lab135_Abstraction {
    public static void main(String[] args) {
        SmartDevice.printManufacturerInfo();

        // Can't instantiate abstract class directly
        // SmartDevice device = new SmartDevice(); // Compile error

        // But we can demonstrate through a concrete subclass
        SmartDevice phone = new SmartPhone("Galaxy X");
        phone.displayInfo();
        phone.connect();
    }
}
abstract class SmartDevice {
    // Non-static field
    protected String deviceName;

    // Static field
    public static final String MANUFACTURER = "TechCorp";

    // Constructor
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        System.out.println("Initializing " + deviceName);
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void connect();

    // Non-abstract (concrete) method
    public void displayInfo() {
        System.out.println("Device: " + deviceName);
        System.out.println("Manufacturer: " + MANUFACTURER);
    }

    // Static method
    public static void printManufacturerInfo() {
        System.out.println("All devices made by " + MANUFACTURER);
    }

    // Can even have main method (though unusual)
    public static void main(String[] args) {
        System.out.println("Testing Main method inside SmartDevice abstract class");
        printManufacturerInfo();

        // Can't instantiate abstract class directly
        // SmartDevice device = new SmartDevice(); // Compile error

        // But we can demonstrate through a concrete subclass
        SmartDevice phone = new SmartPhone("Samsung X");
        phone.displayInfo();
        phone.connect();
    }
}

// Concrete subclass
class SmartPhone extends SmartDevice {
    public SmartPhone(String name) {
        super(name); // Calling abstract class constructor
    }

    @Override
    public void connect() {
        System.out.println(deviceName + " connected via 5G network");
    }
}

// Another concrete subclass
class SmartWatch extends SmartDevice {
    public SmartWatch(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println(deviceName + " connected via Bluetooth");
    }

    // Can add additional methods
    public void showTime() {
        System.out.println(deviceName + " shows current time");
    }
}