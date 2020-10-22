
public class Trapezoid extends Quadrilaterals {
    public Trapezoid() {
        super();
    }
    
    public Trapezoid(double b1, double b2, double h) {
        super (b1,b2,h);
    }
    
    public String getMyType() {
        return "Trapezoid";
    }
    
    public String toString() {
        return "Trapezoid and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}