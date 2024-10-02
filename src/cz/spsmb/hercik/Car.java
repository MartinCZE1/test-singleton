package cz.spsmb.hercik;

public class Car extends cz.spsmb.hercik.Factory.Car {
    private String engine;
    private String color;
    private String wheels;

    public Car(String engine, String color, String wheels) {
        this.engine = engine;
        this.color = color;
        this.wheels = wheels;
    }

    public static CarEngineBuilder builder() {
        return new CarEngineBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }
}
