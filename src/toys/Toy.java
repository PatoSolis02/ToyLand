package toys;

public abstract class Toy implements IToy {
    protected Toy(int product, String name){};

    @Override
    public int getProductCode() {return 0;}

    @Override
    public String getName() {return null;}

    @Override
    public int getHappiness() {return 0;}

    @Override
    public boolean isRetired() {return false;}

    @Override
    public double getWear() {return 0;}

    @Override
    public void increaseWear(double amount) {}

    @Override
    public void play(int minutes) {}

    protected abstract void specialPlay(int minutes);

    @Override
    public String toString() {return null;}

}
