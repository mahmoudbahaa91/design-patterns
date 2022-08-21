package creational.objectpool;

import java.awt.geom.Point2D;

public class Bitmap implements Image {

    private Point2D location;

    @Override
    public void draw() {
        System.out.println("Drawing a Bitmap of: " + this);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Reset");
    }
}
