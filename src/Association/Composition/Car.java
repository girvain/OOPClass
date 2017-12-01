package Association.Composition;

public class Car {

    private String model;
    private final Engine engine; // not sure if final is necessary

    /**
     * The constructor creates a new engine for the class to use. It is not accessable
     * outside the the class so it will die with the object, making the relationship
     * Composition.
     */
    public Car() {
        this.engine = new Engine();
    }

    /** Setters and Getters
     */

    public float getEngineSize() {
        return engine.getEngineSize();
    }

    public void setEngineSize(float engineSize) {
        engine.setEngineSize(engineSize);
    }

    public String getFuelType() {
        return engine.getFuelType();
    }

    public void setFuelType(String fuelType) {
        engine.setFuelType(fuelType);
    }

    public boolean isTurbo() {
        return engine.isTurbo();
    }

    public void setTurbo(boolean turbo) {
        engine.setTurbo(turbo);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
