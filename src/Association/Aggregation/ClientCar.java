package Association.Aggregation;

public class ClientCar {

    public static void main(String[] args) {

        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        Engine engine3 = new Engine((float) 1.4, "Diesel", false);

        engine1.setEngineSize((float) 1.9);
        engine1.setFuelType("Diesel");
        engine1.setTurbo(true);

        engine2.setEngineSize((float) 1.6);
        engine2.setFuelType("Diesel");
        engine2.setTurbo(false);

        Car myCar1 = new Car();
        myCar1.setEngine(engine3);

        System.out.println("===============The engine details for the car =============");
        System.out.println("The size of the engine is + " + myCar1.getEngine().getEngineSize());
        System.out.println("The fuel type of the engine is " + myCar1.getEngine().getFuelType());
        System.out.println("The turbo specifics of the engine is " + myCar1.getEngine().isTurbo());
    }
}
