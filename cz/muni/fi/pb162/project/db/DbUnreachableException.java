package cz.muni.fi.pb162.project.db;


/**
 * Write a description of class DbUnreachableException here.
 * 
 * @author Jan Hrubeš 
 * @version 14.11.2012 0.001
 */
public class DbUnreachableException extends DbException
{
    /**
     * Default constructor
     */
    public DbUnreachableException ()
    {
    }

    /**
     * Constructor for DbUnreachableException
     * 
     * @param message message for exception
     */
    public DbUnreachableException (String message)
    {
        super (message);
    }

    /**
     * Constructor for DbUnreachableException
     * 
     * @param cause cause of exception
     */
    public DbUnreachableException (Throwable cause)
    {
        super (cause);
    }

    /**
     * Constructor for DbUnreachableException
     * 
     * @param message message for exception
     * @param cause cause of exception
     */
    public DbUnreachableException (String message, Throwable cause)
    {
        super (message, cause);
    }
}
