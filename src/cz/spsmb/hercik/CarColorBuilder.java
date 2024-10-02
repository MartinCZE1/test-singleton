package cz.spsmb.hercik;

public class CarColorBuilder {
    private String engine;
    private String color;
    private String wheels;

    public CarColorBuilder(String engine) {
        this.engine = engine;
    }

    public CarWheelsBuilder setColor(String color) {
        this.color = color;
        return new CarWheelsBuilder(engine, this.color);
    }
}
