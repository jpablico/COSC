package PracticeClass;

public class Spaceship {
    private String name;
    private int speed;

    public Spaceship(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println(name + " accelerating to " + speed + " km/h");
    }

    public void decelerate(int decrease) {
        speed = Math.max(0, speed - decrease);
        System.out.println(name + " decelerating to " + speed + " km/h");
    }

    public static void main(String[] args) {
        Spaceship mySpaceship = new Spaceship("Galactic Voyager", 5000);
        System.out.println("Spaceship Name: " + mySpaceship.getName());
        System.out.println("Initial Speed: " + mySpaceship.getSpeed() + " km/h");

        mySpaceship.accelerate(1000);
        mySpaceship.decelerate(2000);
    }
}
