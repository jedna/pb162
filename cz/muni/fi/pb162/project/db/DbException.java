package cz.muni.fi.pb162.project.db;


/**
 * Write a description of class DbException here.
 * 
 * @author Jan Hrubeš 
 * @version 14.11.2012 0.001
 */
public class DbException extends Exception
{
    /**
     * Default constructor
     */
    public DbException ()
    {
    }

    /**
     * Constructor for DbException
     * 
     * @param message message for exception
     */
    public DbException (String message)
    {
        super (message);
    }

    /**
     * Constructor for DbException
     * 
     * @param cause cause of exception
     */
    public DbException (Throwable cause)
    {
        super (cause);
    }

    /**
     * Constructor for DbException
     * 
     * @param message message for exception
     * @param cause cause of exception
     */
    public DbException (String message, Throwable cause)
    {
        super (message, cause);
    }
}
