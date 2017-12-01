package Association.Composition;

public class Engine {

    private float engineSize;
    private String fuelType;
    private boolean turbo;

    Engine() {

    }

    public Engine(float engineSize, String fuelType, boolean turbo) {
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.turbo = turbo;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
