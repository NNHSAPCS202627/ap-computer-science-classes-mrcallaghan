/**
 * Chapter 3: Door (pair)
 * 
 * Represents a remotely-operated door that can be locked, unlocked, opened, and closed.
 * Allows querying and setting the door's state and name.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Door
{
    private boolean isLocked;
    private boolean isOpened;
    private String name;
    
    /**
     * Constructs a new Door with default state (unlocked and closed, no name).
     */
    public Door()
    {
        // default state of a new door is unlocked and closed
        this.isLocked = false;
        this.isOpened = false;
        this.name = null;
    }
    
    /**
     * Constructs a new Door with specified open state and name. Door is unlocked by default.
     * @param opened true if the door should start opened, false if closed
     * @param initialName the name of the door
     */
    public Door(boolean opened, String initialName)
    {
        this.isLocked = false;
        this.isOpened = opened;
        this.name = initialName;
    }
    /**
     * Constructs a new Door with specified locked state, open state, and name.
     * @param locked true if the door should start locked, false if unlocked
     * @param opened true if the door should start opened, false if closed
     * @param initialName the name of the door
     */
    public Door(boolean locked, boolean opened, String initialName)
    {
        this.isLocked = locked;
        this.isOpened = opened;
        this.name = initialName;
    }
    
    /**
     * Locks the door.
     */
    public void lock()
    {
        this.isLocked = true;
    }
    
    /**
     * Unlocks the door.
     */
    public void unlock()
    {
        this.isLocked = false;
    }
    
    /**
     * Opens the door.
     */
    public void open()
    {
        this.isOpened = true;
    }
    
    /**
     * Closes the door.
     */
    public void close()
    {
        this.isOpened = false;
    }
    
    // personal style would be to call this method isLocked,
    //  but I'm trying to be consistent with other examples
    /**
     * Returns whether the door is locked.
     * @return true if the door is locked, false otherwise
     */
    public boolean getLocked()
    {
        return this.isLocked;
    }

    // personal style would be to call this method isOpened,
    //  but I'm trying to be consistent with other examples
    /**
     * Returns whether the door is opened.
     * @return true if the door is opened, false otherwise
     */
    public boolean getOpened()
    {
        return this.isOpened;
    }

    /**
     * Returns the name of the door.
     * @return the name of the door
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets the name of the door.
     * @param newName the new name for the door
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    /**
     * Returns a string representation of the door's state.
     * @return a string describing the door's name, open state, and locked state
     */
    public String toString()
    {
        String str = "The state of this door:\n";
        str += "name: " + this.getName() + "\n";
        str += "opened: " + this.getOpened() + "\n";
        str += "locked: " + this.getLocked() + "\n";
        return str;
        
    }

    
    public static void main(String[] args)
    {
        System.out.println("Door Class Demonstration");
        System.out.println("========================\n");
        
        // Test default constructor
        System.out.println("1. Creating a door with default constructor:");
        Door door1 = new Door();
        System.out.println(door1);
        
        // Test second constructor
        System.out.println("2. Creating a door with name and open state:");
        Door door2 = new Door(true, "Front Door");
        System.out.println(door2);
        
        // Test third constructor
        System.out.println("3. Creating a door with all parameters:");
        Door door3 = new Door(true, false, "Back Door");
        System.out.println(door3);
        
        // Test all methods on door1
        System.out.println("4. Testing all methods on the first door:");
        
        // Test setName
        door1.setName("Main Entrance");
        System.out.println("After setting name to 'Main Entrance':");
        System.out.println("Name: " + door1.getName());
        
        // Test lock and getLocked
        door1.lock();
        System.out.println("After locking:");
        System.out.println("Is locked: " + door1.getLocked());
        
        // Test open and getOpened
        door1.open();
        System.out.println("After opening:");
        System.out.println("Is opened: " + door1.getOpened());
        
        // Test unlock
        door1.unlock();
        System.out.println("After unlocking:");
        System.out.println("Is locked: " + door1.getLocked());
        
        // Test close
        door1.close();
        System.out.println("After closing:");
        System.out.println("Is opened: " + door1.getOpened());
        
        // Show final state using toString
        System.out.println("\nFinal state of door1:");
        System.out.println(door1);
        
    }

}