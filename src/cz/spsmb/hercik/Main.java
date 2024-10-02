package cz.spsmb.hercik;

import cz.spsmb.hercik.Factory.CarDealershipSingleton;

public class Main {

    public static void main(String[] args) {
        Car car = Car.builder().setEngine("1.4L").setColor("Black").setWheels("Sport").build();
        Car car2 = Car.builder().setEngine("1.6L").setColor("Red").setWheels("Offroad").build();
        System.out.println(car);

       //CarDealershipSingleton carDealershipSingleton = new CarDealershipSingleton();

        CarDealershipSingleton dealership = CarDealershipSingleton.getInstance();
        dealership.orderCar(car);
        dealership.orderCar(car2);
        System.out.println(dealership.printOrders());
    }
}
