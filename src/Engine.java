public class Engine implements Cloneable {
    int maxSpeed;
    String markaMashini;
    String nameOfEngine;
    int strength;
    int durability;

    public Engine(int maxSpeed, String markaMashini, String nameOfEngine, int strength, int durability) {
        this.maxSpeed = maxSpeed;
        this.markaMashini = markaMashini;
        this.nameOfEngine = nameOfEngine;
        this.strength = strength;
        this.durability = durability;
    }
    protected Object clone2() throws CloneNotSupportedException {
        return super.clone();
    }
}
