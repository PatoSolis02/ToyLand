package toys;

public class Robot extends BatteryPowered {
    private static final int FLY_SPEED = 25;
    private static final int RUN_SPEED = 10;
    private static final int INITIAL_SPEED = 0;
    private static int code = 400;
    private boolean flying;
    private int distance = 0;

    protected Robot(String name, int numBatteries, boolean flying) {
        super(code, name, numBatteries);
        this.flying = flying;
        code++;
    }

    public boolean isFlying() {
        return this.flying;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override
    protected void specialPlay(int minutes) {
        if (isFlying()) {
            this.distance += minutes * FLY_SPEED;
            System.out.println("\t" + getName() + " is flying around with total distance: " + this.distance);
            increaseWear(FLY_SPEED);
        } else {
            this.distance += minutes * RUN_SPEED;
            System.out.println("\t" + getName() + " is running around with total distance: " + this.distance);
            increaseWear(RUN_SPEED);
        }
        useBatteries(minutes);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Robot{F:" + this.flying + ", D:" + this.distance + "}";
    }
}
