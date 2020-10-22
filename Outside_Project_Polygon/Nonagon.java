
public class Nonagon extends Agon {
    public Nonagon() {
        super();
    }
    
    public Nonagon(double l) {
        super (9,l);
    }
    
    public String getMyType() {
        return "Nonagon";
    }
    
    public String toString() {
        return "Nonagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
