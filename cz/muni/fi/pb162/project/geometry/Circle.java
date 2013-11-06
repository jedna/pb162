    package cz.muni.fi.pb162.project.geometry;


/**
 * Class representing a circle.
 * 
 * @author Jan Hrubeš 
 * @version 24.10.2012 0.003
 */
public class Circle extends GeneralRegularPolygon
{
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle()
    {
        this(new Vertex2D(0,0), 1);
    }
    
    /**
     * Constructor for objects of class Circle
     * 
     * @param Vertex2D center of circle
     * @param double radius of circle
     */
    public Circle(Vertex2D center, double radius)
    {
        super(center, Integer.MAX_VALUE, 0);
        this.radius = radius;
    }

    /**
     * Getter for radius value
     * 
     * @return double radius 
     */
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength()
    {
        return 2 * Math.PI * radius;
    }
    
    /**
     * String representation of class (overloaded)
     * 
     * @return String Text
     */
    public String toString()
    {
        return "Circle: center=" + this.getCenter() + ", radius=" + this.getRadius();
    }
}
