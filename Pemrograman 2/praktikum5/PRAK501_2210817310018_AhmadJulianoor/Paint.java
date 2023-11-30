package praktikum5.PRAK501_2210817310018_AhmadJulianoor;
public class Paint {
    private double coverage;
    public Paint(double c){coverage = c;}
    public double amount(Shape s){
        System.out.println("Computing amount for "+ s);
        return s.area()/coverage;
    }
}
