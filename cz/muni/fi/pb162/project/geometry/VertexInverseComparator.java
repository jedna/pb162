package cz.muni.fi.pb162.project.geometry;
import java.util.Comparator;


/**
 * Write a description of class VertexInverseComparator here.
 * 
 * @author Jan Hrubeš
 * @version 11.12.2012 0.001
 */
public class VertexInverseComparator implements Comparator<Vertex2D>
{

    /**
     * Compare two vertices
     * @param first vertex
     * @param second vertex
     */
    public int compare(Vertex2D first, Vertex2D second) {
        if(first.getX() == second.getX()) {
            if(first.getY() == second.getY()) {
                return 0;
            }
                return (first.getY() < second.getY())?1:-1;
        }
        
        return (first.getX() < second.getX())?1:-1;
    }
}
