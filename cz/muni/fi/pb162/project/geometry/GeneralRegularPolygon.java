package cz.muni.fi.pb162.project.geometry;


/**
 * Class representing general polygon
 * 
 * @author Jan Hrubeš 
 * @version 24.10.2012 0.001
 */
public class GeneralRegularPolygon implements RegularPolygon, Colored
{
    private Vertex2D center;
    private int numEdges;
    private double edgeLength;
    private Color color;

    /**
     * Constructor for objects of class GeneralRegularPolygon
     * 
     * @param Vertex2D center
     * @param int number of edges
     * @param double edge length
     */
    public GeneralRegularPolygon(Vertex2D center, int edgesCount, double edgesLength)
    {
        this.center = center;
        this.numEdges = edgesCount;
        this.edgeLength = edgesLength;
        this.color = Colored.Color.WHITE;
    }

    public Vertex2D getCenter()
    {
        return this.center;
    }

    public double getRadius()
    {
        return this.edgeLength/(2*Math.sin(Math.PI/this.numEdges));
    }

    public double getEdgeLength()
    {
        return this.edgeLength;
    }

    public int getNumEdges()
    {
        return this.numEdges;
    }
    
    public Colored.Color getColor()
    {
        return this.color;
    }
    
    public void setColor(Colored.Color color)
    {
        this.color = color;
    }
    
    public double getArea()
    {
        return 0.5*this.numEdges*Math.pow(this.getRadius(), 2)*Math.sin(2*Math.PI/this.numEdges);
    }
    
    public double getWidth()
    {
        return this.getRadius() * 2;
    }
    
    public double getHeight()
    {
        return this.getRadius() * 2;
    }

    public double getLength()
    {
        return this.numEdges * this.edgeLength;
    }
    
    /**
     * Returns string  representation of polygon
     * 
     * @return  String   string
     */
    public String toString()
    {
        return this.numEdges + "-gon: center=" + this.center + ", edge length=" + this.edgeLength + ", color=" + this.color;
    }
}
