package cz.muni.fi.pb162.project.db;


/**
 * Write a description of class CannotStoreException here.
 * 
 * @author Jan Hrubeš 
 * @version 14.11.2012 0.001
 */
public class CannotStoreException extends DbException
{
    /**
     * Default constructor
     */
    public CannotStoreException ()
    {
    }

    /**
     * Constructor for CannotStoreException
     * 
     * @param message message for exception
     */
    public CannotStoreException (String message)
    {
        super (message);
    }

    /**
     * Constructor for CannotStoreException
     * 
     * @param cause cause of exception
     */
    public CannotStoreException (Throwable cause)
    {
        super (cause);
    }

    /**
     * Constructor for CannotStoreException
     * 
     * @param message message for exception
     * @param cause cause of exception
     */
    public CannotStoreException (String message, Throwable cause)
    {
        super (message, cause);
    }
}
