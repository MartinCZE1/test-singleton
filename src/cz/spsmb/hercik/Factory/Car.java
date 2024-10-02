package cz.spsmb.hercik.Factory;

import java.util.ArrayList;
import java.util.List;

public class Car implements VehicleInterface {
    List<Car> carList = new ArrayList<>();
    Car x;

    @Override
    public void orderCar(Car car) {
        carList.add(car);
        System.out.println("This car has been ordered: " + car);
    }

    @Override
    public String printOrders() {
        return carList.toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carList=" + carList +
                '}';
    }
}
