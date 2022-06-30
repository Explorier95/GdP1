public class Reporter {

    public Reporter(){

    }

    static public void report(Shape s, Rectangle r, Square sq, Circle c){
        s = new Shape(s.xOrigin,s.yOrigin);
        System.out.println(s.toString());

        r = new Rectangle(r.xOrigin,r.yOrigin, r.xDelta, r.yDelta);
        System.out.println(r.toString());

        sq = new Square(sq.xOrigin,sq.yOrigin,sq.xDelta,sq.yDelta);
        System.out.println(sq.toString());

        c = new Circle(c.xOrigin,c.yOrigin,c.radius);
        System.out.println(c.toString());
    }
}
