public class Car implements Drivable, Tradable {
    private int maxSpeed;

    public Car() {
        this.maxSpeed = 3;
    }

    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getPrice() {
        return 20;
    }

    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }
}
