
public class Pentagon extends Agon {
    public Pentagon() {
        super();
    }
    
    public Pentagon(double l) {
        super (5,l);
    }
    
    public String getMyType() {
        return "Pentagon";
    }
    
    public String toString() {
        return "Pentagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}