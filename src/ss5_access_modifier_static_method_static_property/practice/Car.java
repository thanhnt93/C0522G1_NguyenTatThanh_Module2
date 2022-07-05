package ss5_access_modifier_static_method_static_property.practice;

public class Car {

    private String name;

    private String engine;


    public static int numberOfCars;


    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }
// getters and setters

}