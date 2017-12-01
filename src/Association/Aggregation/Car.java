package Association.Aggregation;

public class Car {

    private String model;
    private Engine engine;

    public Car() {
    }


    /** this setter is passed in an engine object which makes the relationship "Aggregation"
        because this object will live on after the Car is garbage collected because the
        reference is outside this object.
     **/
    public void setEngine(Engine engine) {
      this.engine = engine;
    }

    /** this getter further establishes the relationship of aggregation as it gives the user
     * access to the engine object allowing for editing and continuation after Car dies.
     */
    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
