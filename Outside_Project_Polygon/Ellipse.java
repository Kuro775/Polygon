
public class Ellipse extends Rounds {
    private double myRadius2;
    public Ellipse() {
        this(0,0);
    }
    
    public Ellipse(double r, double r2) {
        super(r);
        myRadius2 = r2;
    }
    
    public void calculateArea() {
        setMyArea(getMyRadius() * myRadius2 * Math.PI);
    }
    
    public String getMyType() {
        return "Ellipse";
    }
    
    public String toString() {
        return "Ellipse and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
