/**
 * This class models a mileage tracker for a car.
 *
 * @author mrcallaghan
 * @version 14sep2026
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables (to store the object's attributes):
     *      - specify the visibility (e.g., private)
     *          - public: accessible by any code in any class
     *          - private: only accessible by methods in this class
     *      - specify the type (e.g., int, String, Turtle, etc.)
     *      - specify the name (e.g., distanceDriven)
     *      
     *      Instance variables differ from local variables in teh following ways:
     *          - scoped to the class (accessible in all methods in the class)
     *          - lifetime is the same as that of the object
     *          - automatically initialized to a default value (0, false, null)
     *          - best practice is not to immediately initialize instance variables (but do so in the constructor)
     */
    private int distanceDriven;         // in units of miles
    private int fuelConsumed;           // in unit of gallons
    private String vin;                 // vehicle identification number


    /*
     * 3. Define the constructor(s) to initialize objects:
     *      - responsible for initializing newly created objects
     *      - invoked automatically via the new operator
     *      - name of the constructor must match the class name exactly
     *      - has no return type (not even void)
     *      - multiple constructors may be defined for a class
     *      - one constructor can call another (with limitations)
     */
    /**
     * Default constructor for the MileageTracker class.
     *      Initializes the object with values of 0 miles driven, 0 fuelConsumed, and a null vin.
     */
    public MileageTracker()
    {
        /*
         * The "this" reserved word references the current object (like "self" in Python).
         *      It's use in highly encouraged, but not require in most cases.
         */
        this.distanceDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
        
    }
    
    /**
     * Constructor that initializes a new MileageTrackr object with a specified miles driven and fuel consumed.
     * 
     * @param initalDistanceDriven the number of miles alread driven
     * @param initialFuelConsumed the number of gallons of fuel already consumed
     */
    public MileageTracker(int initialDistanceDriven, int initialFuelConsumed)
    {
        this.vin = null;
    }
    
    
    
    
     
    
    
    /*
     * 1. Define methods by specifying:
     *      - the visibility (e.g., public, private)
     *      - the return type (e.g.,  void, int, String, etc.)
     *      - the method name (e.g, incrementDistanceDriven, getDistanceDriven, etc.)
     *      - the paramters and their type (e.g., miles of type int)
     * 
     */
    
    // javadoc comments use the /** prefix
    /**
     * Increments the numbers of miles that the car has driven.
     * 
     * @param miles the number of miles to drive the car
     */
    public void incrementDistanceDriven(int miles)
    {
        // to be implemented later
    }
    
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total miles driven
     */
    public int getDistanceDriven()
    {
        return 0;
    }
    
    
    
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(int gallons)
    {
        //this.fuelConsumed += gallons;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public int getFuelConsumed()
    {
        //return this.fuelConsumed;
        return 0;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public int getMileage()
    {
        //int mileage = this.fuelConsumed / this.distanceDriven;
        //return mileage;
        return 0;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        //return this.vin;
        return "";
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param vin    the vehicle identification (VIN) of this car
     */
    public void setVIN(String vin)
    {
        //vin = vin;
    }
    
    
    public static void main()
    {
        // client code goes here
    }
}





