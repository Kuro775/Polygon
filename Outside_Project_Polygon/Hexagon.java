
public class Hexagon extends Agon {
    public Hexagon() {
        super();
    }
    
    public Hexagon(double l) {
        super (6,l);
    }
    
    public String getMyType() {
        return "Hexagon";
    }
    
    public String toString() {
        return "Hexagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
