
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private Room currentRoom;
    
    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        this.name = name;
    }

    /**
     * Enter the given room.
     */
    public void enterRoom(Room room) {
        currentRoom = room;
    }
    
    /**
     * Gets the room in which the player is currently located.
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }
    
    public String getName() {
        return name;
    }
}
