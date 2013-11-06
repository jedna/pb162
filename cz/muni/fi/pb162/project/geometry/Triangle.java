package cz.muni.fi.pb162.project.geometry;


/**
 * Class representing a triangle
 * 
 * @author Jan Hrubeš 
 * @version 7.11.2012 0.004
 */
public class Triangle extends ArrayPolygon implements Solid
{
    public static final double EPSILON = 0.001;

    /**
     * Constructor for objects of class Triangle
     * 
     * @param Vertex2D vertex A
     * @param Vertex2D vertex B
     * @param Vertex2D vertex C
     */
    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c)
    {
        super(new Vertex2D[] {a, b, c});
    }
    
    /**
     * Method to tell whether triangle is equilateral or not
     * 
     * @return boolean Result 
     */
    public boolean isEquilateral()
    {  
        double s1 = this.getVertex(0).distance(this.getVertex(1));
        double s2 = this.getVertex(0).distance(this.getVertex(2));
        double s3 = this.getVertex(1).distance(this.getVertex(2));
        
        return ((Math.abs(s1-s2) < EPSILON) && (Math.abs(s1-s3) < EPSILON) && (Math.abs(s2-s3) < EPSILON));
    }
}
