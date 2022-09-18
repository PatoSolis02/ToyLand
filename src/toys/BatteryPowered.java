package toys;

public abstract class BatteryPowered extends Toy{
    private final static int FULLY_CHARGED = 100;
    private final static int DEPLETED = 0;
    private int numBatteries;
    private int batteryLevel;
    protected BatteryPowered(int productCode, String name, int numBatteries){
        super(productCode, name);
        this.numBatteries = numBatteries;
        this.batteryLevel = FULLY_CHARGED;
    }

    public int getBatteryLevel(){return this.batteryLevel;}

    public int getNumBatteries(){return this.numBatteries;}

    public void useBatteries(int time){
        this.batteryLevel -= time + numBatteries;
        if(this.batteryLevel <= DEPLETED){
            this.batteryLevel = DEPLETED;
            System.out.println("\t" + "DEPLETED:" + toString());
            this.batteryLevel = FULLY_CHARGED;
            System.out.println("\t" + "RECHARGED:" + toString());
        }
    }

    @Override
    public String toString(){
        return super.toString() +
                ", BatteryPowered{BL:" + this.batteryLevel +
                ", NB:" + this.numBatteries + "}";
    }
}
