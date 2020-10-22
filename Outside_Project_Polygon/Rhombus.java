
public class Rhombus extends Parallelogram {
    public Rhombus() {
        super();
    }
    
    public Rhombus(double b1,double h) {
        super (b1,h);
    }
    
    public String getMyType() {
        return "Rhombus";
    }
    
    public String toString() {
        return "Rhombus and I am also a " + super.toString();
    }
}
