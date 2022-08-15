package creational.prototype;

public class GameCharacter implements Cloneable {

    private Position position;

    private final String characterName;

    private final int speed;

    private final String color;

    public GameCharacter(String characterName, int speed, String color, int x, int y) {
        this.characterName = characterName;
        this.speed = speed;
        this.color = color;
        this.position = new Position(x, y);
    }

    public void moveRight() {
        //create another Position, as clone is a shallow copy so the Position will refer to the same reference.
        Position newPosition = new Position(this.position.x, this.position.y);
        newPosition.x++;
        this.position = newPosition;
    }

    @Override
    protected GameCharacter clone() throws CloneNotSupportedException {
        return (GameCharacter) super.clone();
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "characterName='" + characterName + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                position.toString() +
                '}';
    }
}
