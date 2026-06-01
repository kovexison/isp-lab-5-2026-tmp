package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        laptop.charge(30);
        smartPhone.charge(30);
        smartWatch.charge(30);

        System.out.println(laptop);
        System.out.println(smartPhone);
        System.out.println(smartWatch);
    }
}
