/*
 * Shape.java
 *
 * Base class for geometrical shapes.
 *
 * Copyright (c) 2009 Prof. Dr. Gerrit Jan Veltink
 * All Rights Reserved
 *
 * 1.00  27 Apr 2009  initial version
 *
 */

/**
 * Base class for geometrical shapes. Each shape has an explicit origin
 * represented by a point: (x,y).
 * 
 * @ version 1.00
 * @author Fabian Tappendorf
 */
public class Shape {

    /** x-coordinate of the origin */
    protected double xOrigin;

    /** y-coordinate of the origin */
    protected double yOrigin;

    /**
     * Constructor for a shape taking as argument the two coordinates of the
     * origin.
     * 
     * @param x
     *            the x-coordinate of the shapes' origin
     * @param y
     *            the y-coordinate of the shapes' origin
     * 
     */
    public Shape(double x, double y) {
        xOrigin = x;
        yOrigin = y;
    }

    /**
     * calculate the area of a shape. the base shape is just point so it has no
     * area.
     * 
     * @return the area of the shape
     */
    public double area() {
        return 0;
    }

    /**
     * calculate the circumference of a shape. the base shape is just point so
     * it has no circumference.
     * 
     * @return the circumference of the shape
     */
public double circumference(){
    return 0;
}

    /**
     * constructs a textual representation of the origin in the form: "(x, y)".
     * *
     * 
     * @return the origin on textual representation
     */
    public String origin() {
        return ("(" + xOrigin + ", " + yOrigin + ")");
    }

    /**
     * constructs a textual representation of the object.
     * 
     * @return the current object in a textual representation
     */
    @Override
    public String toString() {
        return ("Class" + getClass() + "\n " +
                getClass() + " with origin: \n" + origin() + "\n" +
                "Circumference of " + getClass() + ":\n " + circumference() + "\n" +
                "Area of " + getClass() + ":\n " + area() + "\n--------------------------------------\n");
    }
}
