package cz.muni.fi.pb162.project.geometry;


/**
 * Class representing a vertex.
 * 
 * @author Jan Hrubeš 
 * @version 3.10.2012 0.001
 */
public class Vertex2D implements Comparable<Vertex2D>
{

    private double coordinateX;
    private double coordinateY;

    /**
     * Constructor for objects of class Vertex2D
     * 
     * @param double coordinate x
     * @param double coordinate y
     */
    public Vertex2D(double x, double y)
    {
        coordinateX = x;
        coordinateY = y;
    }
    
    /**
     * Getter for X coordinate
     * 
     * @return x X coordinate 
     */
    public double getX()
    {
        return this.coordinateX;
    }
    
    /**
     * Getter for Y coordinate
     * 
     * @return y Y coordinate
     */
    public double getY()
    {
        return this.coordinateY;
    }
    
    /**
     * String representation of class (overloaded)
     * 
     * @return String Text
     */
    public String toString()
    {
        return "[" + this.coordinateX + ", " + this.coordinateY + "]";
    }
    
    /**
     * Distance between two vertices
     * 
     * @param Vertex2D Vertex to calculate distance from
     * @return double Distance
     */
    public double distance(Vertex2D v)
    {
        if(v == null) {
            return -1.0;
        }
        
        return Math.sqrt(Math.pow((v.getX() - this.getX()), 2) + Math.pow((v.getY() - this.getY()), 2));
    }
    
    @Override public boolean equals(Object obj)
    {
        if(obj == this) {
            return true;
        }    
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
            
        Vertex2D vertex = (Vertex2D) obj;
        return (this.coordinateX == vertex.coordinateX && this.coordinateY == vertex.coordinateY);
    }
    
    @Override public int hashCode()
    {
        int hashcode;
        hashcode = 23;
        hashcode = (hashcode * 37) + (int) coordinateX;
        hashcode = (hashcode * 37) + (int) coordinateY;
        
        return hashcode;
    }
    
    @Override public int compareTo(Vertex2D obj) {
        if(this.coordinateX == obj.coordinateX) {
            if(this.coordinateY == obj.coordinateY) {
                return 0;
            }
            return (this.coordinateY > obj.coordinateY)?1:-1;
        }
        return (this.coordinateX > obj.coordinateX)?1:-1;
    }
}
