package toys;

public abstract class BatteryPowered extends Toy{
    protected BatteryPowered(int productCode, String name, int numBatteries){
        super(0, name);
    }

    public int getBatteryLevel(){return 0;}

    public int getNumBatteries(){return 0;}

    public void useBatteries(int time){}

    @Override
    public String toString(){return null;}
}
