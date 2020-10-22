
public class Octagon extends Agon {
    public Octagon() {
        super();
    }
    
    public Octagon(double l) {
        super (8,l);
    }
    
    public String getMyType() {
        return "Octagon";
    }
    
    public String toString() {
        return "Octagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
