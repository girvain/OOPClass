package Encapsulation;

public class ClientCar {

    public static void main(String[] args) {
        Car myCar = new Car();

        /*
        myCar.speed=0;
        myCar.make="Volkswagen";
        myCar.model="Passat";
        myCar.year=2004;
        myCar.colour="Silver";
        myCar.miles=130000;

        System.out.println("The make of my car is "+myCar.make+
                ". The model of my car is "+myCar.model);
        */

        myCar.setSpeed(0);
        myCar.setMake("Volkswagen");
        myCar.setModel("Passet");
        myCar.setYear(2004);
        myCar.setColour("silver");
        myCar.setMiles(130000);
        System.out.println("The make of myu car is " + myCar.getMake() + ". The model of my car is "+
        myCar.getModel());

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        myCar.decelerate();

        System.out.println("the current speed of my car is " + myCar.getSpeed());
    }
}
