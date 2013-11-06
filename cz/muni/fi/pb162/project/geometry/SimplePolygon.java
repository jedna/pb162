package cz.muni.fi.pb162.project.geometry;


/**
 * Abstract class SimplePolygon
 * 
 * @author Jan Hrubeš
 * @version 7.11.2012 0.001
 */
public abstract class SimplePolygon implements Polygon
{
    public double getHeight()
    {
        double minY, maxY;
        
        minY = getVertex(0).getY();
        maxY = minY;
        
        for(int i = 1; i < getNumVertices(); i++){
            minY = Math.min(minY, getVertex(i).getY());
            maxY = Math.max(maxY, getVertex(i).getY());
        }
        
        return maxY - minY;
    }
    
    public double getWidth()
    {
        double minX, maxX;
        
        minX = getVertex(0).getX();
        maxX = minX;
        
        for(int i = 1; i < getNumVertices(); i++){
            minX = Math.min(minX, getVertex(i).getX());
            maxX = Math.max(maxX, getVertex(i).getX());
        }
        
        return maxX - minX;
    }
    
    public double getLength()
    {
        double length = 0;
        
        for(int i = 0; i < getNumVertices(); i++){
            length += getVertex(i).distance(getVertex(i+1));
        }
        
        return length;
    }
    
    public double getArea()
    {
        double area = 0;
        
        for(int i = 0; i < getNumVertices(); i++){
            area += getVertex(i).getX() * getVertex(i+1).getY() - getVertex(i).getY() * getVertex(i+1).getX();
        }
        
        return area/2;
    }
    
    public String toString()
    {
        String ret =  new String("Polygon: vertices =");
        
        for(int i = 0; i < getNumVertices(); i++){
            ret += " ";
            ret += getVertex(i);
        }
        
        return ret;
    }
}
