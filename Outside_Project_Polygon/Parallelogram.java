
public class Parallelogram extends Trapezoid {
    public Parallelogram() {
        super();
    }
    
    public Parallelogram(double b1, double h) {
        super (b1,0,h);
    }
    
    public void calculateArea() {
        setMyArea(getMyBase1()*getMyHeight());
    }
    
    public String getMyType() {
        return "Parallelogram";
    }
    
    public String toString() {
        return "Parallelogram and I am also a " + super.toString();
    }
}
