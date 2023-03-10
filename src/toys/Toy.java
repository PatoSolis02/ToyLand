package toys;

/**
 * A toy is an object that can be played with.
 * Implements IToy.
 *
 * @author Patricio Solis
 */
public abstract class Toy implements IToy {
    private final static int INITIAL_HAPPINESS = 0;
    private final static int MAX_HAPPINESS = 100;
    private final static double INITIAL_WEAR = 0.0;
    private double wear = 0;
    private int happiness = 0;
    private int code;
    private String name;

    protected Toy(int product, String name){
        this.code = product;
        this.name = name;
    };

    @Override
    public int getProductCode() {return this.code;}

    @Override
    public String getName() {return this.name;}

    @Override
    public int getHappiness() {return this.happiness;}

    @Override
    public boolean isRetired() {
        if(getHappiness() >= MAX_HAPPINESS) {
            return true;
        }
        return false;
    }

    @Override
    public double getWear() {return this.wear;}

    @Override
    public void increaseWear(double amount) {
        this.wear += amount;
    }

    @Override
    public void play(int minutes) {
        System.out.println("PLAYING(" + minutes + "): " + toString());
        specialPlay(minutes);
        this.happiness += minutes;
        if(isRetired()){
            System.out.println("RETIRED: " + toString());
        }
    }

    protected abstract void specialPlay(int minutes);


    /**
     * Formatted output of Toy's attributes (unique code,
     * name, happiness, retired or not, and wear)
     *
     * @return String that includes all desired toy information
     */
    @Override
    public String toString() {
        return "Toy{PC:" + this.code + ", N:"
                + this.name + ", H:" + this.happiness
                + ", R:" + this.isRetired()
                + ", W:" + this.wear + "}";
    }

}
