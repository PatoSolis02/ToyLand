package toys;

public class PlayDough extends Toy{
    protected PlayDough(String name, Color color){
        super(0, name);
    }

    public String getColor(){return null;}

    protected void specialPlay(int time){}

    @Override
    public String toString() {return null;}
}
