
public class Rectangle extends Parallelogram {
    public Rectangle() {
        super();
    }
    
    public Rectangle(double b1, double h) {
        super (b1,h);
    }
    
    public String getMyType() {
        return "Rectangle";
    }
    
    public String toString() {
        return "Rectangle and I am also a " + super.toString();
    }
}
