package toys;

public class RCCar extends BatteryPowered{
    protected RCCar(String name, int numBatteries){
        super(0, name, numBatteries);
    }

    public int getSpeed(){return 0;}

    @Override
    protected void specialPlay(int minutes) {}

    @Override
    public String toString(){return null;}
}
