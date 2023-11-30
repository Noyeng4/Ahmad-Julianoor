package praktikum5.PRAK501_2210817310018_AhmadJulianoor;
public class Cylinder extends Shape{
    private Double radius, height;
    public Cylinder(Double r, Double h){
        super("Cylinder");
        radius = r;
        height = h;
    }
    public Double area(){return Math.PI*(radius*radius)*height;}
    public String toString(){return super.toString() + " of radius " + radius + " and height " + height;}
}
