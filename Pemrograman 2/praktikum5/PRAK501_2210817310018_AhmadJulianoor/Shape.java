package praktikum5.PRAK501_2210817310018_AhmadJulianoor;
public abstract class Shape {
    protected String shapeName;
    public Shape (String name){shapeName = name;}
    protected abstract Double area();
    public String toString(){return shapeName;}
}
