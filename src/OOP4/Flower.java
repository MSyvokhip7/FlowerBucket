package OOP4;

/**
 * Created TheOriginMS7 i5 on 03.10.2016.
 */
public class Flower {

    protected FlowerSpec spec;

    public void setType(FlowerType type) {
        spec.setType(type);
    }
    public FlowerType getType() { return spec.getType();}

    public void setPrice(double price) {
        spec.setPrice(price);
    }
    public double getPrice() { return spec.getPrice();}

    public void setLength(double length) {
        spec.setLength(length);
    }
    public double getLength() { return spec.getLength();}

    public void setColor(FlowerColor color) {
        spec.setColor(color);
    }
    public FlowerColor getColor() { return spec.getColor();}

    public void setFresh(boolean freshness) {
        spec.setFresh(freshness);
    }
    public boolean isFresh() {return spec.isFresh();}


    public String toString() {
        return spec.toString();
    }

}
