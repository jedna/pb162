package cz.muni.fi.pb162.project.demo;

import cz.muni.fi.pb162.project.geometry.Vertex2D;
import cz.muni.fi.pb162.project.geometry.Triangle;
//import cz.muni.fi.pb162.project.geometry.Circle;


/**
 * Basic class with no functionality but main method.
 * 
 * @author Jan Hrubeš 
 * @version 3.10.2012 0.002
 */
public class Demo
{
    /**
     * Constructor for objects of class Demo
     */
    public Demo()
    {
                
    }
    
    /**
     * Main method, prints out coordinates of triangle instatinated from Triangle class
     * 
     * @param String[] args     Command line arguments
     */
    public static void main(String[] args)
    {
        Vertex2D v1= new Vertex2D(-1,0);
        Vertex2D v2 = new Vertex2D(0,1);
        Vertex2D v3 = new Vertex2D(1,-1);
        Triangle t1 = new Triangle(v1, v2, v3);

        System.out.println(t1);
    }
}
