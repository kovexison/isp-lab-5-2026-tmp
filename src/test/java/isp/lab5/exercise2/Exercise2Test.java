package isp.lab5.exercise2;

import org.junit.Assert;
import org.junit.Test;

public class Exercise2Test {
    @Test
    public void testChargingSpeeds() {
        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        laptop.charge(10);
        smartPhone.charge(10);
        smartWatch.charge(10);

        Assert.assertEquals(5, laptop.getBatteryLevel());
        Assert.assertEquals(10, smartPhone.getBatteryLevel());
        Assert.assertEquals(20, smartWatch.getBatteryLevel());
    }
}
