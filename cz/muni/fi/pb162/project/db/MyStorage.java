package cz.muni.fi.pb162.project.db;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import java.io.IOException;


/**
 * Write a description of class MyStorage here.
 * 
 * @author Jan Hrubeš 
 * @version 14.11.2012 0.001
 */
public class MyStorage implements Storage
{
    private Connector connector;
    private int maxAttempts;

    /**
     * Constructor for objects of class MyStorage
     * 
     * @param connector connector providing connection
     * @param maxAttempts maximum attempts for data sending
     */
    public MyStorage(Connector connector, int maxAttempts)
    {
        if(connector == null)
            throw new NullPointerException("connector");
            
        if(maxAttempts < 1)
            throw new IllegalArgumentException("maxAttempts");
            
        this.connector = connector;
        this.maxAttempts = maxAttempts;
    }

    public void store(String host, Object data) throws DbException
    {
        try{
            Connection conn = connector.getConnection(host);
            boolean sent = false;
            
            while(sent == false) {
                try {
                    conn.sendData(data);
                    sent = true;
                }
                catch(IOException ex){
                    maxAttempts--;
                    if(maxAttempts == 0)
                        throw new CannotStoreException(ex);
                }
            }
        }
        catch(UnknownHostException ex){
            throw new DbUnreachableException(ex);
        }
        catch(NoRouteToHostException ex){
            throw new DbUnreachableException(ex);
        }
    }
}
