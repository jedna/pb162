package cz.muni.fi.pb162.project.geometry;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Class representing a polygon with vertices in collection.
 * 
 * @author jan Hrubeš 
 * @version 21.11.2012 0.001
 */
public class CollectionPolygon extends SimplePolygon
{
    private List<Vertex2D> vertices;

    /**
     * Constructor for objects of class CollectionPolygon
     * 
     * @param vertices array of vertices
     * @throws NullPointerException if array is null or contains null pointer
     */
    public CollectionPolygon(Vertex2D [] vertices) throws NullPointerException
    {
        if(vertices == null)
            throw new NullPointerException("Null pointer instead of array.");
        
        this.vertices = new ArrayList<Vertex2D>(Arrays.asList(vertices));
        
        Iterator it=this.vertices.iterator();

        while(it.hasNext())
        {
          if(it.next() == null)
                throw new NullPointerException("Array contains null pointer.");     
        }
    }
    
    public Vertex2D getVertex(int index)
    {
        if(index < 0)
            throw new IllegalArgumentException("Invalid index number.");
            
        return this.vertices.get(index % getNumVertices());
    }
    
    public int getNumVertices()
    {
        return vertices.size();
    }
    
    /**
     * Getter for vertices
     * @return list of vertices
     */
    public List<Vertex2D> getVertices()
    {
        return Collections.unmodifiableList(this.vertices);
    }
    
    /**
     * Returns clone of polygon with inverted vertices
     * @return inverted polygon
     */
    public CollectionPolygon invert()
    {
        Collections.reverse(vertices);
        return this;
    }
}
