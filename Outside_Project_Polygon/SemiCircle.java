
public class SemiCircle extends Circle {
    public SemiCircle() {
        super();
    }
    
    public SemiCircle(double r) {
        super(r);
    }
    
    public void calculateArea() {
        setMyArea(getMyRadius() * getMyRadius() * Math.PI / 2);
    }
    
    public String getMyType() {
        return "SemiCircle";
    }
    
    public String toString() {
        return "SemiCircle and I am also a " + super.toString();
    }
}
