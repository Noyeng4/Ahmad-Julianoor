package praktikum5.PRAK501_2210817310018_AhmadJulianoor;
import java.lang.Math;
public class Sphere extends Shape {
    private double radius;
    public Sphere(Double r){
        super("Sphere");
        radius = r;
    }
    public Double area(){return 4*Math.PI*(radius*radius);}

    public String toString(){return super.toString() + " of radius " + radius;}
}
