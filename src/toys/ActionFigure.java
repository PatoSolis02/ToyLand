package toys;

public class ActionFigure extends Doll{
    private static final Color HAIR_COLOR = Color.ORANGE;

    protected ActionFigure(String name, int age, String speak){
        super(name, HAIR_COLOR, age, speak);
    }

    public int getEnergyLevel(){return 0;}

    @Override
    protected void specialPlay(int minutes) {}

    @Override
    public String toString(){return null;}
}
