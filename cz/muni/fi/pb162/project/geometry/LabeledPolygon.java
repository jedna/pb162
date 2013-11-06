package cz.muni.fi.pb162.project.geometry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collection;
import java.io.*;

/**
 * Write a description of class LabeledPolygon here.
 * 
 * @author Jan Hrubeš 
 * @version 11.12.2012 0.001
 */
public class LabeledPolygon extends SimplePolygon implements PolygonIO
{
    private SortedMap<String, Vertex2D> vertices = new TreeMap<String, Vertex2D>();
    
    /**
     * Constructor for objects of class LabeledPolygon
     */
    public LabeledPolygon()
    {
        
    }

    /**
     * Add vertex to polygon
     * @param label of vertex
     * @param vertex itself
     */
    public void addVertex(String label, Vertex2D vert) {
        if(label == null) {
            throw new NullPointerException("Vertex label cannot be null.");
        }
        if(vert == null) {
            throw new NullPointerException("Vertex cannot be null.");
        }
        vertices.put(label, vert);
    }
    
    /**
     * Returns vertex by label key
     * @param label key
     */
    public Vertex2D getVertex(String label) {
        if(!vertices.containsKey(label)) {
            throw new IllegalArgumentException("Required vertex does not exist.");
        }
        return vertices.get(label);
    }
    
    public Vertex2D getVertex(int index) {
       if(index < 0) {
           throw new IllegalArgumentException("Index cannot be lower than zero.");
       }
       Vertex2D[] ar = vertices.values().toArray(new Vertex2D[vertices.size()]);
       return ar[index % vertices.size()];
    }
    
    /**
     * Return collection of labels that are assigned to specified vertex
     * @param vertex to find labels for
     */
    public Collection<String> getLabels(Vertex2D vert) {
        Set<String> keys = new HashSet<String>();
        for(String i: vertices.keySet()) {
            if(vertices.get(i).equals(vert)) {
                keys.add(i);
            }
        }
        return keys;
    }
    
    /**
     * Returns vertices in natural order
     */
    public Collection<Vertex2D> getSortedVertices() {
        return new TreeSet<Vertex2D>(vertices.values());
    }
    
    /**
     * Returns vertices in order specified by provided comparator
     * @param comparator 
     */
    public Collection<Vertex2D> getSortedVertices(Comparator<Vertex2D> comparator) {
       SortedSet<Vertex2D> values = new TreeSet<Vertex2D>(comparator);
       values.addAll(vertices.values());
       return values;
    }
    
    public int getNumVertices() {
        return vertices.size();
    }
    
    /* PolygonIO methods
     * =========================================
     */
    
    public void write(OutputStream os) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(os));
        String output = "";
        Vertex2D v = null;
        
        try {
            for(Map.Entry<String, Vertex2D> entry : vertices.entrySet()) {
                v = entry.getValue();
                out.write(v.getX() + " " + v.getY() + " " + entry.getKey());
                out.newLine();
            }
        }
        catch(IOException ex) {
            throw new IOException("Error while writing to output stream", ex);
        }        
    }
    
    public void write(File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        try {
            write(os);        
            os.close();
        }
        catch(IOException ex) {
            throw new IOException("Error while writing to file", ex);
        }
    }
    
    public void read(InputStream is) throws IOException {
        String line = null;
        Set<String> lines = new LinkedHashSet<String>();
        
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            
            while((line = in.readLine()) != null) {
                lines.add(line);
            }
            
            String parts[] = null;
            for(String l: lines) {
                parts = l.split(" ", 3);
                addVertex(parts[2], new Vertex2D(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])));
            }
        } 
        catch(IOException ex) {
            throw new IOException("Error while reading from input stream", ex);
        }
        catch(NumberFormatException ex) {
            throw new IOException("Bad coordinate format", ex);
        }   
    }
    
    public void read(File file) throws IOException {
        try {
            InputStream is = new FileInputStream(file);
            read(is);
            is.close();
        }
        catch(IOException ex) {
            throw new IOException("Error while reading from file", ex);
        }
    }
}
