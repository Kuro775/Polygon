
public class Heptagon extends Agon {
    public Heptagon() {
        super();
    }
    
    public Heptagon(double l) {
        super (7,l);
    }
    
    public String getMyType() {
        return "Heptagon";
    }
    
    public String toString() {
        return "Heptagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
