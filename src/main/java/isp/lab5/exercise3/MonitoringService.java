package isp.lab5.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonitoringService {
    private final List<Sensor> sensors = new ArrayList<>();

    public boolean addSensor(Sensor sensor) {
        if (sensor == null || sensors.size() >= 10) {
            return false;
        }
        sensors.add(sensor);
        return true;
    }

    public List<Sensor> getSensors() {
        return Collections.unmodifiableList(sensors);
    }

    public double getAvarageTemperatureSensors() {
        double total = 0;
        int count = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                total += ((TemperatureSensor) sensor).getTemperature();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public double getAvarageAllSensors() {
        double total = 0;
        int count = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                total += ((TemperatureSensor) sensor).getTemperature();
                count++;
            } else if (sensor instanceof PressureSensor) {
                total += ((PressureSensor) sensor).getPressure();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    @Override
    public String toString() {
        return "MonitoringService{sensors=" + sensors + "}";
    }
}
