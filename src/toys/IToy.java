package toys;

public interface IToy {
    public int getProductCode();

    int getHappiness();

    boolean isRetired();

    double getWear();

    void increaseWear(double amount);

    void play(int time);

    String getName();
}
