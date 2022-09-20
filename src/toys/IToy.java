package toys;

/**
 * Interface for what Toys need to implement.
 *
 * @author Patricio Solis
 */
public interface IToy {

    /**
     * accessor for the specific code of the toy
     *
     * @return int unique product code of toy
     */
    int getProductCode();


    /**
     * accessor for the current happiness of the toy
     *
     * @return int happiness of specific toy
     */
    int getHappiness();


    /**
     * Checks if happiness of toy has reached MAX_HAPPINESS
     * and if it has retires the toy
     *
     * @return boolean true if retired; false otherwise
     */
    boolean isRetired();


    /**
     * accessor fot the current wear of specific toy
     *
     * @return double current wear of specific toy
     */
    double getWear();


    /**
     * Increases wear by given amount; dependent on
     * type of toy
     *
     * @param amount double the amount to increase wear by
     */
    void increaseWear(double amount);


    /**
     * Prints out a statement with information of how long
     * toy is being played with. Calls the specialPlay of
     * given toy, increases happiness, and checks if toy
     * is retired or not
     *
     * @param time int the amount of time toy is played with
     */
    void play(int time);


    /**
     * accessor for the name of specific toy
     *
     * @return String the name of the toy
     */
    String getName();
}
