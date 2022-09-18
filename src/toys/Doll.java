package toys;

public class Doll extends Toy{
    private Color hairColor;
    private int age;
    private String speak;
    private static int code = 200;
    protected Doll(String name, Color hairColor, int age, String speak){
        super(code, name);
        this.age = age;
        this.hairColor = hairColor;
        this.speak = speak;
        code++;
    }

    public Color getHairColor(){return this.hairColor;}

    public int getAge(){return this.age;}

    public String getSpeak(){return this.speak;}

    @Override
    protected void specialPlay(int minutes) {
        System.out.println("\t" + getName() + " brushes their " + getHairColor()
                            + " hair and says, " + "\"" + this.speak + "\"");
        increaseWear(age);
    }

    @Override
    public String toString(){
        return super.toString() +
                ", Doll{HC:" +
                this.hairColor +
                ", A:" + this.age +
                ", S:" + this.speak + "}";
    }
}
