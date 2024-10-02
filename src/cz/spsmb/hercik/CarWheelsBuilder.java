package cz.spsmb.hercik;

public class CarWheelsBuilder {
    private String engine;
    private String color;
    private String wheels;

    public CarWheelsBuilder(String engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public CarWheelsBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    public Car build() {
        if ((engine == null || engine.isEmpty()) || (color == null || color.isEmpty()) || (wheels == null || wheels.isEmpty())) {
            throw new IllegalArgumentException("Engine, color and wheels cannot be empty!");
        } else {
            return new Car(engine, color, wheels);
        }
    }


}
