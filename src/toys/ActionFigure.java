package toys;

public class ActionFigure extends Doll{
    private static final Color HAIR_COLOR = Color.ORANGE;
    private final static int MIN_ENERGY_LEVEL = 1;
    private int energyLevel;
    private static int code = 200;

    protected ActionFigure(String name, int age, String speak){
        super(name, HAIR_COLOR, age, speak);
        this.energyLevel = MIN_ENERGY_LEVEL;
    }

    public int getEnergyLevel(){return this.energyLevel;}

    @Override
    protected void specialPlay(int minutes) {
        System.out.println("\t" + getName() + " kung foo chops with "
                            + minutes * this.energyLevel +  " energy!");
        this.energyLevel += 1;
        super.specialPlay(minutes);
    }

    @Override
    public String toString(){
        return super.toString() +
                ", ActionFigure{E:" + this.energyLevel + "}";
    }
}
