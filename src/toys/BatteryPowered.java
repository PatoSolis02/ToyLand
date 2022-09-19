package toys;

public abstract class BatteryPowered extends Toy{
    /** the highest battery level of the BatteryPowered Toy */
    private final static int FULLY_CHARGED = 100;
    /** the lowest the battery level can go */
    private final static int DEPLETED = 0;
    /** the number of batteries battery powered toy has */
    private int numBatteries;
    /** the intial battery level */
    private int batteryLevel;


    /**
     * BatteryPowered's constructor. Calls the constructor of its parent class
     * and initializes the number of batteries and battery level of BatteryPowered.
     *
     * @param productCode int the unique id of BatteryPowered toy (provided by subclasses)
     * @param name String the name of the BatteryPowered toy
     * @param numBatteries int the number of batteries
     */
    protected BatteryPowered(int productCode, String name, int numBatteries){
        super(productCode, name);
        this.numBatteries = numBatteries;
        this.batteryLevel = FULLY_CHARGED;
    }

    /**
     * accessor for the battery level
     *
     * @return int the battery level of specific instance of BatteryPowered
     */
    public int getBatteryLevel(){return this.batteryLevel;}


    /**
     * accessor for the number of batteries
     *
     * @return int the number of batteries of specific instance of BatteryPowered
     */
    public int getNumBatteries(){return this.numBatteries;}


    /**
     * Takes the amount of time and changes the battery level in accordance with
     * the amount of time it was played with. Checks if the battery level is depleted
     * and if it is it recharges it to full.
     *
     * @param time int the amount of time the toy was played with
     */
    public void useBatteries(int time){
        this.batteryLevel -= time + numBatteries;
        if(this.batteryLevel <= DEPLETED){
            this.batteryLevel = DEPLETED;
            System.out.println("\t" + "DEPLETED:" + toString());
            this.batteryLevel = FULLY_CHARGED;
            System.out.println("\t" + "RECHARGED:" + toString());
        }
    }

    /**
     * Formatted output of Toy's toString() with specific information that pertains
     * to BatteryPowered.
     *
     * @return String that includes all the desired toy and BatteryPowered's information
     */
    @Override
    public String toString(){
        return super.toString() +
                ", BatteryPowered{BL:" + this.batteryLevel +
                ", NB:" + this.numBatteries + "}";
    }
}
