package toys;

/**
 * A Doll is a toy, so it extends Toy. It also
 * implements its own constructor, an accessor for
 * hair color, an accessor for the age, an accessor
 * for speak, special play, and its specific toString.
 *
 * @author Patricio Solis
 */
public class Doll extends Toy{
    /** color of the Doll's hair */
    private Color hairColor;
    /** age of the doll */
    private int age;
    /** the noise produced by the doll */
    private String speak;
    /** start of unique id for each Doll created */
    private static int code = 200;


    /**
     * Doll's constructor. Calls the constructor of its parent class
     * and initializes the hair color, age, and speak of doll and
     * increments the unique id after each instance created.
     *
     * @param name String the name of the doll
     * @param hairColor Color the color of the doll's hair (from enum class Color)
     * @param age int the age of the doll
     * @param speak String the sounds produced by dolls
     */
    protected Doll(String name, Color hairColor, int age, String speak){
        super(code, name);
        this.age = age;
        this.hairColor = hairColor;
        this.speak = speak;
        code++;
    }

    /**
     * accessor for the hair color of Doll
     *
     * @return Color the hair color of specific instance of Doll
     */
    public Color getHairColor(){return this.hairColor;}


    /**
     * accessor for the age of the doll
     *
     * @return int the age of specific instance of Doll
     */
    public int getAge(){return this.age;}


    /**
     * accessor for the sound produced by Doll
     *
     * @return String the sound produced by specific instance of Doll
     */
    public String getSpeak(){return this.speak;}


    /**
     * The specific actions Doll takes when it is played with.
     * Prints out a unique play statement that describes what is getting
     * played with and how they are getting played with. Also increments
     * the specific instance's wear.
     *
     * @param minutes int the amount of time the Doll was played with
     */
    @Override
    protected void specialPlay(int minutes) {
        System.out.println("\t" + getName() + " brushes their " + getHairColor()
                            + " hair and says, " + "\"" + this.speak + "\"");
        increaseWear(age);
    }

    /**
     * Formatted output of Toy's toString() with specific information that pertains
     * to Doll.
     *
     * @return String that includes all the desired toy and Doll's information
     */
    @Override
    public String toString(){
        return super.toString() +
                ", Doll{HC:" +
                this.hairColor +
                ", A:" + this.age +
                ", S:" + this.speak + "}";
    }
}
