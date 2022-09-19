package toys;

public class Robot extends BatteryPowered {
    /** speed of Robot when flying */
    private static final int FLY_SPEED = 25;
    /** speed of Robot when running */
    private static final int RUN_SPEED = 10;
    /** initial speed of Robot */
    private static final int INITIAL_SPEED = 0;
    /** start of unique id for each Robot created */
    private static int code = 400;
    /** state of flying or not */
    private boolean flying;
    /** total distance travelled */
    private int distance = 0;

    /**
     * Robot's constructor. Calls the constructor of its parent class
     * and initializes the flying state and increments the unique id
     * after each instance created.
     *
     * @param name String name of the Robot instance
     * @param numBatteries int number of batteries Robot has
     * @param flying boolean true if flying; false otherwise
     */
    protected Robot(String name, int numBatteries, boolean flying) {
        super(code, name, numBatteries);
        this.flying = flying;
        code++;
    }


    /**
     * accessor for state of flying.
     *
     * @return boolean true if flying; false otherwise
     */
    public boolean isFlying() {
        return this.flying;
    }


    /**
     * accessor for total distance travelled
     *
     * @return int the total distance travelled
     */
    public int getDistance() {
        return this.distance;
    }

    /**
     * The specific actions Robot takes when it is played with.
     * Prints out a unique play statement that describes what is getting
     * played with and how they are getting played with (different for
     * flying and running). Decreases the battery level. Also increments
     * the specific instance's wear (depending on flying or running).
     *
     * @param minutes int the amount of time Robot was played with
     */
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


    /**
     * Formatted output of BatteryPowered's toString() with specific information that pertains
     * to Robot.
     *
     * @return String that includes all the desired toy information
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Robot{F:" + this.flying + ", D:" + this.distance + "}";
    }
}
