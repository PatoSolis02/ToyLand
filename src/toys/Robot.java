package toys;

public class Robot extends BatteryPowered{
    protected Robot(String name, int numBatteries, boolean flying){
        super(0, name, numBatteries);
    }

    public boolean isFlying(){return false;}

    public int getDistance(){return 0;}

    @Override
    protected void specialPlay(int minutes) {}

    @Override
    public String toString(){return null;}
}
