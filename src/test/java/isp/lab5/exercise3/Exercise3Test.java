package isp.lab5.exercise3;

import org.junit.Assert;
import org.junit.Test;

public class Exercise3Test {
    @Test
    public void testAverages() {
        MonitoringService monitoringService = new MonitoringService();
        monitoringService.addSensor(new TemperatureSensor("Lab", "T-1", 20));
        monitoringService.addSensor(new PressureSensor("Lab", "P-1", 100));

        Assert.assertEquals(20, monitoringService.getAvarageTemperatureSensors(), 0.001);
        Assert.assertEquals(60, monitoringService.getAvarageAllSensors(), 0.001);
    }
}
