package toys;

public class PlayDough extends Toy{

    private final static double WEAR_MULTIPLIER = 0.05;
    private static int nextId = 100;
    private Color color;

    protected PlayDough(String name, Color color){

        super(nextId, name);
        this.color = color;
        nextId++;

    }

    public Color getColor(){return this.color;}

    protected void specialPlay(int time){
        System.out.println("\tArts and crafting with " +
                            this.color +
                            " " + this.getName());
        increaseWear(time * WEAR_MULTIPLIER);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", PlayDough{C:" +
                this.color + "}";
    }
}
