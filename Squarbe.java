package TrienKhai;

public class Squarbe extends Rectanglebe {
    public  Squarbe() {
        super(1.0,1.0);
    }

    public Squarbe(double side){
        super(side,side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent / 100);
    }

    @Override
    public String toString() {
        return String.format("Square{side=%.2f, area=%.2f}", getSide(), getArea());
    }
}
