
public class Dodecagon extends Agon {
    public Dodecagon() {
        super();
    }
    
    public Dodecagon(double l) {
        super (12,l);
    }
    
    public String getMyType() {
        return "Dodecagon";
    }
    
    public String toString() {
        return "Dodecagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
