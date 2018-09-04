public class Vehicle {
    private int rpm;
    private int speed;
    private int gears;         // number of gears
    private int currentGear;   // what gear the car is in currently


    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "rpm=" + rpm +
                ", speed=" + speed +
                ", gears=" + gears +
                ", currentGear=" + currentGear +
                '}';
    }

    public Vehicle(int rpm, int speed, int gears, int currentGear) {
        this.rpm = rpm;
        this.speed = speed;
        this.gears = gears;
        this.currentGear = currentGear;
    }

    public String accelerate(int deltaVelocity) {
        speed += deltaVelocity;
        if (deltaVelocity > 0) {
            rpm += 350;
            if (deltaVelocity < 0)
                rpm -= 350;
            if (rpm > 2700) {
                if (currentGear < gears) ;
                currentGear += 1;
                rpm = 2600;
            } else if (currentGear == gears) ;
            currentGear += 1;
            if (rpm > 2900) ;
            System.out.println("Slow down!");
            if (rpm < 2300) ;
            if (currentGear > 1) ;
            currentGear -= 1;
            rpm = 2600;
        }
return "";
    }
}



    /* let IntelliJ help you create
           the getters and setters,
           the toString
           and a constructor
    */

