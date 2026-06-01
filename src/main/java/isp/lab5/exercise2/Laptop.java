package isp.lab5.exercise2;

public class Laptop implements Chargeable {
    private int batteryLevel;

    public Laptop() {
        this(0);
    }

    public Laptop(int batteryLevel) {
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
    }

    @Override
    public void charge(int duration) {
        if (duration <= 0) {
            return;
        }
        batteryLevel += duration / 2;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
    }

    @Override
    public String toString() {
        return "Laptop{batteryLevel=" + batteryLevel + "}";
    }
}
