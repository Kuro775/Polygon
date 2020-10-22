
public class Isosceles extends Scalene {
    public Isosceles() {
        super();
    }
    
    public Isosceles(double b, double h) {
        super(b,h);
    }
    
    public String getMyType() {
        return "Isosceles";
    }
          
    public String toString() {
        return "Isosceles and I am also a " + super.toString();
    }
}