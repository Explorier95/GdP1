/**
 * @author Fabian Tappendorf
 * program has contact to the orignin class Shape but using its own parameters.
 */
public class Rectangle extends Shape{

    protected double xDelta;
    protected double yDelta;
    /**
     * Constructor for a shape taking as argument the two coordinates of the
     * origin.
     *
     * @param x the x-coordinate of the shapes' origin
     * @param y the y-coordinate of the shapes' origin
     * @param xDelta the x-coordinate of the square to calculate with
     * @param yDelta the y-coordinate of the square to calculate with
     */
    public Rectangle(double x, double y,double xDelta, double yDelta) {
        super(x, y);
        this.xDelta = xDelta;
        this.yDelta = yDelta;

    }

    public double getxDelta() {
        return xDelta;
    }

    public double getyDelta() {
        return yDelta;
    }

    /**
     *
     * @return
     * returns the circumference
     */
    public double circumference(){
        if (yDelta != 0) {
            return (4 * xDelta) + (4 * yDelta);
        } else if (yDelta == 0) {
            return (xDelta * 4) + (xDelta * 4);
        }
        return 0;
    }

    /**
     *
     * @return
     * returns the area
     */
    public double area(){
        if (yDelta != 0) {
            return (2 * xDelta) * (2 * yDelta);
        } else if (yDelta == 0) {
            return (xDelta * 2) * (xDelta * 2);
        }
        return 0;

    }

    /**
     *
     * @return
     * returns a String for show
     */
    @Override
    public String toString(){
        return ("Class: "+ getClass() + "\n"+
                getClass() + " with origin: \n " + origin()+ "\n" +
                "Circumference of " + getClass() + ":\n " + circumference() +" xDelta: " + getxDelta() +" yDelta: "+ getyDelta() + "\n" +
                "Area of "+ getClass() + ":\n " + area() + "\n--------------------------------------\n");
    }
}
