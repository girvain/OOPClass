package Encapsulation;

public class Car {

    private String make;
    private String model;
    private int year;
    private String colour;
    private int miles;
    private int speed;


    /* Class methods */

    public void accelerate() {
        speed++;
    }

    public void decelerate() {
        speed--;
    }


    /* Setters and Getters */

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
