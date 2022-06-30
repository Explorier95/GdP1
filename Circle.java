/**
 * @author Fabian Tappendorf
 * program has contact to the orignin class Shape but using its own parameters.
 */
public class Circle extends Shape{

    protected double radius;
    /**
     * Constructor for a shape taking as argument the two coordinates of the
     * origin.
     *
     * @param x the x-coordinate of the shapes' origin
     * @param y the y-coordinate of the shapes' origin
     */
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     *
     * @return
     * calculate the circumference of the circle and return it
     */
    @Override
    public double circumference() {
        return 2 * radius * Math.PI;
    }

    /**
     *
     * @return
     * calculate area of the circle and return it
     */
    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2) ;
    }

    /**
     *
     * @return
     * new stringmethode to return also a radius
     */
    @Override
    public String toString() {

        return ("Class: "+ getClass() + "\n"+
                getClass() + " with origin: \n " + origin()+ "\n" +
                "Circumference of " + getClass() + ":\n " + circumference() +" Radius: "+ getRadius() + "\n" +
                "Area of "+ getClass() + ":\n " + area() + "\n--------------------------------------\n");
    }

}
