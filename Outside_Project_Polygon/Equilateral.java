
public class Equilateral extends Isosceles {
    public Equilateral() {
        super();
    }
    
    public Equilateral(double b, double h) {
        super(b,h);
    }
    
    public String getMyType() {
        return "Equilateral";
    }
          
    public String toString() {
        return "Equilateral and I am also a " + super.toString();
    }
}
