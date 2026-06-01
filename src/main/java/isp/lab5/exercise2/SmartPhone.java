package isp.lab5.exercise2;

public class SmartPhone implements Chargeable {
    private int batteryLevel;

    public SmartPhone() {
        this(0);
    }

    public SmartPhone(int batteryLevel) {
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
    }

    @Override
    public void charge(int duration) {
        if (duration <= 0) {
            return;
        }
        batteryLevel += duration;
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
        return "SmartPhone{batteryLevel=" + batteryLevel + "}";
    }
}
