package cz.spsmb.hercik;

public class CarEngineBuilder {
    private String engine;
    private String color;
    private String wheels;

    public CarColorBuilder setEngine(String engine) {
        this.engine = engine;
        return new CarColorBuilder(engine);
    }
}
