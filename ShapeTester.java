/**
 * @author Fabian Tappendorf
 * Main program to test the shapeclasses
 * We create new objects and give them values with the methode report from the class Reporter we access the needed methods
 */
public class ShapeTester {

    public static void main(String[] args) {

        // new Shape, Rectangle, Square and Circle -objects are created.
        Shape form = new Shape (10,40);
        Rectangle rechtEck = new Rectangle (20,30,35,15);
        Square dreiEck = new Square (30,20,5,0);
        Circle kreis = new Circle (40,10,25);
        Reporter r = new Reporter();
        // we want the report from the objects to see the information we are interested in
        r.report(form,rechtEck,dreiEck,kreis);



    }
}
