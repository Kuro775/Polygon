
public class Decagon extends Agon {
    public Decagon() {
        super();
    }
    
    public Decagon(double l) {
        super (10,l);
    }
    
    public String getMyType() {
        return "Decagon";
    }
    
    public String toString() {
        return "Decagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
