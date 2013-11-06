package cz.muni.fi.pb162.project.geometry;


/**
 * Write a description of class RegularOctagon here.
 * 
 * @author Jan Hrubeš 
 * @version 24.10.2012 0.001
 */
public class RegularOctagon extends GeneralRegularPolygon
{
    /**
     * Constructor for objects of class RegularOctagon
     * 
     * @param Vertex2D center of polygon
     * @param double edge length
     */
    public RegularOctagon(Vertex2D center, double edgeLength)
    {
        super(center, 8, edgeLength);
    }
}
