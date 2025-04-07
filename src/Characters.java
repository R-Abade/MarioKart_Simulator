public class Characters{
    private final String name;
    private final int speed;
    private final int acceleration;
    private final int handling;
    private final int power;
    private int points;

    public Characters(String name, int speed, int acceleration, int handling, int power, int points) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
        this.handling = handling;
        this.power = power;
        this.points = points;
    }
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAcceleration(){
        return acceleration;
    }

    public int getHandling() {
        return handling;
    }

    public int getPower() {
        return power;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void zerarPoints(){
        this.points = 0;
    }

    @Override
    public String toString() {
        return String.format(
                "%s - Speed: %d, Acceleration: %d, Handling: %d, Power: %d, Points: %d",
                name , speed, acceleration, handling, power, points
        );
    }
}
