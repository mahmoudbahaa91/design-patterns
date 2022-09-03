package structural.bridge;

public abstract class Shape {

    public Shape( Color color) {
        this.color = color;
    }

    protected Color color; // bridging the color

    abstract public String draw();

}
