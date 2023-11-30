package praktikum5.PRAK501_2210817310018_AhmadJulianoor;
public class Rectangle extends Shape{
    private Double length, width;
    public Rectangle(Double l,Double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    public Double area(){return length*width;}
    public String toString(){return super.toString() + " of length " + length + " and width " + width;}
}
