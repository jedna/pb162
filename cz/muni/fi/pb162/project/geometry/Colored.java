package cz.muni.fi.pb162.project.geometry;

/**
 * Objects with color.
 * 
 * @author Radek Oslejsek, oslejsek@fi.muni.cz
 */
public interface Colored {
    
    public enum Color {
        WHITE, BLACK, RED, YELLOW, BLUE;
    }

    /**
     * Returns color of the object.
     * 
     * @return Color name.
     */
    Color getColor();
    
    /**
     * Sets new color.
     * 
     * @param color Color name
     */
    void setColor(Color color);
}
