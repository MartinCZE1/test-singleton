package cz.spsmb.hercik.Factory;

import java.util.ArrayList;
import java.util.List;

public class CarDealershipSingleton {
    List<Car> carList;
    static CarDealershipSingleton carDealershipSingleton;
    Car x;

    private CarDealershipSingleton() {
    }

    private CarDealershipSingleton(List<Car> carList) {
        this.carList = carList;
    }

    public void orderCar(Car car) {
        carList.add(car);
        System.out.println("This car has been ordered: " + car);
    }


    public String printOrders() {
        return carList.toString();
    }

    public static CarDealershipSingleton getInstance() {
        if (carDealershipSingleton == null) {
            carDealershipSingleton = new CarDealershipSingleton();
            carDealershipSingleton.setCarList(new ArrayList<>());
        }
        return carDealershipSingleton;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public static CarDealershipSingleton getSingleton() {
        return carDealershipSingleton;
    }

    public static void setSingleton(CarDealershipSingleton carDealershipSingleton) {
        CarDealershipSingleton.carDealershipSingleton = carDealershipSingleton;
    }

    @Override
    public String toString() {
        return "CarDealershipSingleton{" +
                "carList=" + carList +
                '}';
    }
}
