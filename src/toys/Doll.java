package toys;

public class Doll extends Toy{
    protected Doll(String name, Color hairColor, int age, String speak){
        super(0, name);
    }

    public Color getHairColor(){return null;}

    public int getAge(){return 0;}

    public String getSpeak(){return null;}

    @Override
    protected void specialPlay(int minutes) {}

    @Override
    public String toString(){return null;}
}
