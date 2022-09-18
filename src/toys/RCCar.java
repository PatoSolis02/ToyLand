package toys;

public class RCCar extends BatteryPowered{
    private static final int STARTING_SPEED = 10;
    private static final int SPEED_INCREASE = 5;
    private static int code = 300;
    private int speed;
    protected RCCar(String name, int numBatteries){
        super(code, name, numBatteries);
        this.speed = STARTING_SPEED;
        code++;
    }

    public int getSpeed(){return this.speed;}

    @Override
    protected void specialPlay(int minutes){
        System.out.println("\t" + getName() + " races around at " + this.speed + "mph!");
        useBatteries(minutes);
        increaseWear(this.speed);
        this.speed += SPEED_INCREASE;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", RCCar{S:" + this.speed + "}";
    }
}
