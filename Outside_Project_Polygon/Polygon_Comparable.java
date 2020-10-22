// =====================================================================

/**
 * 
 * Polygon is the base class for Chap_9_ShapesPolygon_Interface_ArrayList project.
 * 
 * (1) Write the Polygon_Comparable interface that has 4 abstract methods in it. 
 *     calculateArea() - used for calculating the area.  (returns void)
 *     getMyArea() - used to get the area.  (returns a double)
 *     getMyType() - used to get the type of Shape int the subclasses(returns String)
 *                      Ex. Isocelese, Square, Hexagon, Circle, etc
 *     getMyCategory() - used to get the category of whatever shape. (returns String)
 *                        Ex. Triangles, Quadrilaterals, Agon, Rounds
 *     
 *     (2) This Interface will "extend Comparable" as one Interface "extend" 's another
 *         and does NOT "implement" another. You will have to override 'compareTo()' in
 *         your subclasses.
 *      Note: compareTo() - used to compare to Shapes area.  (returns an int / takes in an Object)
 *     
 */

public interface Polygon_Comparable extends Comparable<Polygon_Comparable> {
    public static final double THRESHOLD = 0.00000001;
    void calculateArea();
    double getMyArea();
    String getMyType();
    String getMyCategory(); 
    default int compareTo(Polygon_Comparable o) {
        double x = (this.getMyArea() - o.getMyArea());
        return x - (int) x <= THRESHOLD ? 0 : x < 0 ? -1 : 1;
    }
}
