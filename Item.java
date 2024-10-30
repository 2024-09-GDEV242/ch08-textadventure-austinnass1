
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // A description of the item.
    private String description;
    // The weight of the item.
    private double weight;
    
    /**
     * Create a new item with the given description and weight.
     */
    public Item(String description, double weight)
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * Return the item's weight.
     * @return The weight
     */
    public double getWeight()
    {
        return weight;
    }
    
    /**
     * Return a description of the item.
     * @return A description.
     */
    public String getDescription()
    {
        return description;
    }
}
