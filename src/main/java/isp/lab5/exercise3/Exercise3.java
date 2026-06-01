package isp.lab5.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        MonitoringService monitoringService = new MonitoringService();
        monitoringService.addSensor(new TemperatureSensor("Lab", "Temp-1", 22.5));
        monitoringService.addSensor(new PressureSensor("Lab", "Pressure-1", 101.3));

        System.out.println(monitoringService);
        System.out.println("Average temperature: " + monitoringService.getAvarageTemperatureSensors());
        System.out.println("Average all sensors: " + monitoringService.getAvarageAllSensors());
    }
}
