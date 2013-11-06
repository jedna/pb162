package cz.muni.fi.pb162.project.geometry;

/**
 * Interface for convex regular polygons, e.g. equilateral triangle, suqare, regular octagon, etc..
 * 
 * @author Radek Oslejsek <oslejsek@fi.muni.cz>, Masaryk University, Faculty of Informatics
 */
public interface RegularPolygon  extends Solid {

    /**
     * Returns number of edges of the regular polygon.
     * 
     * @return number of edges
     */
    int getNumEdges();
    
    /**
     * Returns length of single edge.
     * 
     * @return edge length
     */
    double getEdgeLength();

    /**
     * Returns center of the minimum bounding circle.
     * 
     * @return center of the minimum bounding circle
     */
    Vertex2D getCenter();
    
    /**
     * Returns radius of the minimum bounding circle.
     * 
     * @return radius of the minimum bounding circle
     */
    double getRadius();
    
}
