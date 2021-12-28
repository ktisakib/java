package lab5.ex2;

public class Fan {

    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Fan on? " + isOn);

    }

    public static void main(String[] args) {

        // create an object of Fan
        Fan wings = new Fan();

        // access method using object
        wings.turnOn();
    }
}

