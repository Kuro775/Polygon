
public class Circle extends Rounds {
    public Circle() {
        super();
    }
    
    public Circle(double r) {
        super(r);
    }
    
    public String getMyType() {
        return "Circle";
    }
    
    public String toString() {
        return "Circle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
