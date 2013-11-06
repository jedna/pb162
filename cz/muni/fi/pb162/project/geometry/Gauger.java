package cz.muni.fi.pb162.project.geometry;


/**
 * Gauger for measurable and solid objects.
 * 
 * @author Jan Hrubeš
 * @version 17.10.2012 0.001
 */
public class Gauger
{
    /**
     * Prints info about solid object, its perimeter and area
     * 
     * @param solidObject object
     */
    public static void printMeasurement(Solid solidObject)
    {
        printMeasurement((Measurable) solidObject);
        System.out.println("Area: " + solidObject.getArea());
    }
    
    /**
     * Prints info about measurable object and its perimeter
     * 
     * @param measurableObject object
     */
    public static void printMeasurement(Measurable measurableObject)
    {
        System.out.println(measurableObject);
        System.out.println("Perimeter: " + measurableObject.getLength());
    }
}
