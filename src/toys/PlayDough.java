package toys;

public class PlayDough extends Toy{

    /** factor to calculate amount of wear */
    private final static double WEAR_MULTIPLIER = 0.05;
    /** start of unique id for each PlayDough created */
    private static int nextId = 100;
    /** the color of the PlayDough */
    private Color color;

    /**
     * PlayDough's constructor. Calls the constructor of its parent class
     * and initializes the color of playdough and increments the unique id
     * after each instance created.
     *
     * @param name String the name of the object
     * @param color Color the color of the PlayDough (from enum class Color)
     */
    protected PlayDough(String name, Color color){
        super(nextId, name);
        this.color = color;
        nextId++;
    }


    /**
     * accessor for the color of PlayDough
     *
     * @return Color the color of specific instance of PlayDough
     */
    public Color getColor(){return this.color;}


    /**
     * The specific actions PlayDough takes when it is played with.
     * Prints out a unique play statement that describes what is getting
     * played with and how they are getting played with. Also increments
     * the specific instance's wear.
     *
     * @param time int the amount of time the PlayDough was played with
     */
    protected void specialPlay(int time){
        System.out.println("\tArts and crafting with " +
                            this.color +
                            " " + this.getName());
        increaseWear(time * WEAR_MULTIPLIER);
    }


    /**
     * Formatted output of Toy's toString() with specific information that pertains
     * to PlayDough.
     *
     * @return String that includes all the desired toy and playdough's information
     */
    @Override
    public String toString() {
        return super.toString() +
                ", PlayDough{C:" +
                this.color + "}";
    }
}
