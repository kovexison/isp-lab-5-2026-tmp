package isp.lab5.exercise2;

public class SmartWatch implements Chargeable {
    private int batteryLevel;

    public SmartWatch() {
        this(0);
    }

    public SmartWatch(int batteryLevel) {
        this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
    }

    @Override
    public void charge(int duration) {
        if (duration <= 0) {
            return;
        }
        batteryLevel += duration * 2;
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
        return "SmartWatch{batteryLevel=" + batteryLevel + "}";
    }
}
