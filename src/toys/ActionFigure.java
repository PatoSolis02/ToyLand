package toys;

public class ActionFigure extends Doll{
    /** hair color for all action figures */
    private static final Color HAIR_COLOR = Color.ORANGE;
    /** initial energy level */
    private final static int MIN_ENERGY_LEVEL = 1;
    /** current energy level */
    private int energyLevel;
    /** start of unique id for each ActionFigure created */
    private static int code = 200;

    /**
     * ActionFigure's constructor. Calls the constructor of its parent class
     * and initializes the energy level.
     *
     * @param name String name of ActionFigure
     * @param age int age of ActionFigure
     * @param speak String sound produced by ActionFigure
     */
    protected ActionFigure(String name, int age, String speak){
        super(name, HAIR_COLOR, age, speak);
        this.energyLevel = MIN_ENERGY_LEVEL;
    }


    /**
     * accessor for the current energy level
     *
     * @return int current energy level
     */
    public int getEnergyLevel(){return this.energyLevel;}


    /**
     * The specific actions ActionFigure takes when it is played with.
     * Prints out a unique play statement that describes what is getting
     * played with and how they are getting played with. Increments the
     * energy level of ActionFigure and calls the special play of
     * parent class.
     *
     * @param minutes int the amount of time the ActionFigure was played with
     */
    @Override
    protected void specialPlay(int minutes) {
        System.out.println("\t" + getName() + " kung foo chops with "
                            + minutes * this.energyLevel +  " energy!");
        this.energyLevel += 1;
        super.specialPlay(minutes);
    }

    /**
     * Formatted output of Doll's toString() with specific information that pertains
     * to ActionFigure.
     *
     * @return String that includes all the desired toy information
     */
    @Override
    public String toString(){
        return super.toString() +
                ", ActionFigure{E:" + this.energyLevel + "}";
    }
}
