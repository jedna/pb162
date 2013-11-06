package cz.muni.fi.pb162.project.geometry;


/**
 * Polygon with vertices stored in array
 * 
 * @author Jan Hrubeš
 * @version 7.11.2012 0.001
 */
public class ArrayPolygon extends SimplePolygon
{
    private Vertex2D [] vertices;

    /**
     * Constructor for objects of class ArrayPolygon
     * 
     * @param vertices array of vertices
     * @throws IllegalArgumentException if array is null or contains null pointer
     */
    public ArrayPolygon(Vertex2D [] vertices) throws IllegalArgumentException
    {
        if(vertices == null)
            throw new IllegalArgumentException("Null pointer instead of array.");
            
        this.vertices = new Vertex2D[vertices.length];
        
        for(int i = 0; i < vertices.length; i++) {
            if(vertices[i] == null)
                throw new IllegalArgumentException("Array contains null pointer.");
                
            this.vertices[i] = vertices[i];
        }
    }

    public Vertex2D getVertex(int index)
    {
        if(index < 0)
            throw new IllegalArgumentException("Invalid index number.");
            
        return this.vertices[index % getNumVertices()];
    }
    
    public int getNumVertices()
    {
        return vertices.length;
    }
}
