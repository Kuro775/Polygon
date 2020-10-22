// angle is opposite of each other, in degree


public class Trapezium extends Quadrilaterals {
    private double mySide1;
    private double mySide2;
    private double myAngle1;
    private double myAngle2;
    
    public Trapezium() {
        this(0,0,0,0,0,0,0);
    }
    
    public Trapezium(double b1, double b2, double h, double s1, double s2, double a1, double a2) {
        super (b1,b2,h);
        mySide1 = s1;
        mySide2 = s2;
        myAngle1 = a1;
        myAngle2 = a2;
    }
    
    public void calculateArea() {
        double s = (getMyBase1() + getMyBase2() + mySide1 + mySide2) / 2;
        double angleSum = myAngle1 + myAngle2;
        double p1 = (s-getMyBase1()) * (s-getMyBase2()) * (s-mySide1) * (s-mySide2);
        double p2 = (getMyBase1() * getMyBase2() * mySide1 * mySide2 * Math.pow(Math.cos(Math.toRadians(angleSum/2)),2));
        setMyArea(Math.sqrt(p1-p2));
    }
    
    public String getMyType() {
        return "Trapezium";
    }
    
    public String toString() {
        return "Trapezium and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}