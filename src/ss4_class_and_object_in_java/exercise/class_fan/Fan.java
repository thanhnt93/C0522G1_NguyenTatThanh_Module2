package ss4_class_and_object_in_java.exercise.class_fan;

public class Fan {
    //    Xây dựng lớp Fan
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
        on = isOn();
        speed = getSpeed();
        radius = getRadius();
        color = getColor();
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius + ", status: " + "fan is on \n";
        } else {
            return "color: " + this.color + ", radius: " + this.radius + ", status: " + "fan is off \n";
        }
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

