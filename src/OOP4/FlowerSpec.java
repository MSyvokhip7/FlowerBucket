package OOP4;

/**
 * Created by TheOriginMS7 on 17.10.2016.
 */
public class FlowerSpec {

    protected FlowerColor color = null;
    protected double length = 0;
    protected boolean freshness = false;
    protected double price = 0;
    protected FlowerType type = null;

    public void setType(FlowerType type) {
        this.type = type;
    }
    public FlowerType getType() { return type;}

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() { return price;}

    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() { return length;}

    public void setColor(FlowerColor color) {
        this.color = color;
    }
    public FlowerColor getColor() { return color;}

    public void setFresh(boolean freshness) {
        this.freshness = freshness;
    }
    public boolean isFresh() {
        return this.freshness;
    }

    public boolean equals(FlowerSpec otherSpec) {
        if (color != otherSpec.getColor()) return false;
        if (length != otherSpec.getLength()) return false;
        if (price != otherSpec.getPrice()) return false;
        if (type != otherSpec.getType()) return false;
        return true;
    }

    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh level is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }
}
