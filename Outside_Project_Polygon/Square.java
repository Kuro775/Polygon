
public class Square extends Rectangle {
    public Square() {
        super();
    }
    
    public Square(double b1) {
        super (b1,b1);
    }
    
    public String getMyType() {
        return "Square";
    }
    
    public String toString() {
        return "Square and I am also a " + super.toString();
    }
}
