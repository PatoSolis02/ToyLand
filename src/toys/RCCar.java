package toys;

/**
 * An RCCar is a battery powered toy, so it extends BatteryPowered
 * which extends Toy. It also implements its own constructor,
 * an accessor to current speed, special play, and its specific
 * toString.
 *
 * @author Patricio Solis
 */
public class RCCar extends BatteryPowered{
    /** initial speed of RCCar */
    private static final int STARTING_SPEED = 10;
    /** increment speed of RCCar */
    private static final int SPEED_INCREASE = 5;
    /** start of unique id for each RCCar created */
    private static int code = 300;
    /** current speed of RCCar */
    private int speed;

    /**
     * RCCar's constructor. Calls the constructor of its parent class
     * and initializes the speed of RCCar and increments the unique id
     * after each instance created.
     *
     * @param name String name of the RCCar instance
     * @param numBatteries int number of batteries RCCar has
     */
    protected RCCar(String name, int numBatteries){
        super(code, name, numBatteries);
        this.speed = STARTING_SPEED;
        code++;
    }


    /**
     * accessor for the speed of the car
     *
     * @return int current speed of the RCCar
     */
    public int getSpeed(){return this.speed;}


    /**
     * The specific actions RCCar takes when it is played with.
     * Prints out a unique play statement that describes what is getting
     * played with and how they are getting played with. Decreases the
     * battery level. Also increments the specific instance's wear and speed.
     *
     * @param minutes int the amount of time the RCCar was played with
     */
    @Override
    protected void specialPlay(int minutes){
        System.out.println("\t" + getName() + " races around at " + this.speed + "mph!");
        useBatteries(minutes);
        increaseWear(this.speed);
        this.speed += SPEED_INCREASE;
    }


    /**
     * Formatted output of BatteryPowered's toString() with specific information that pertains
     * to RCCar.
     *
     * @return String that includes all the desired toy information
     */
    @Override
    public String toString(){
        return super.toString() +
                ", RCCar{S:" + this.speed + "}";
    }
}
