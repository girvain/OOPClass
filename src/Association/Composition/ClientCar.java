package Association.Composition;

public class ClientCar {

    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        myCar1.setEngineSize((float) 1.9);
        myCar1.setFuelType("Diesel");
        myCar1.setTurbo(true);

        myCar2.setEngineSize((float) 1.6);
        myCar2.setFuelType("Diesel");
        myCar2.setTurbo(false);

        System.out.println("===============The engine details for the car 1 =============");
        System.out.println("The size of the engine is + " + myCar1.getEngineSize());
        System.out.println("The fuel type of the engine is " + myCar1.getFuelType());
        System.out.println("The turbo specifics of the engine is " + myCar1.isTurbo());

        System.out.println("===============The engine details for the car 2 =============");
        System.out.println("The size of the engine is + " + myCar2.getEngineSize());
        System.out.println("The fuel type of the engine is " + myCar2.getFuelType());
        System.out.println("The turbo specifics of the engine is " + myCar2.isTurbo());

        /**
         * Further Thoughts:
         * Is is still composition if the object is passed into the class, i.e an Engine passed
         * into the car object. This means that the object could have multiple references before
         * it goes into the parent object which is NOT going to die with the object.
         */
    }
}
