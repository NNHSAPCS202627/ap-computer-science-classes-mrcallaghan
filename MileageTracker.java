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
        System.out.println("Default constructor running...");
    }
    
    /**
     * Constructor that initializes a new MileageTrackr object with a specified miles driven and fuel consumed.
     * 
     * @param initalDistanceDriven the number of miles alread driven
     * @param initialFuelConsumed the number of gallons of fuel already consumed
     */
    public MileageTracker(int initialDistanceDriven, int initialFuelConsumed)
    {
        this.distanceDriven = initialDistanceDriven;
        this.fuelConsumed = initialFuelConsumed;
        this.vin = null;
        System.out.println("Custom constructor running...");
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
        //this.distanceDriven = this.distanceDriven + miles;
        this.distanceDriven += miles;
    }
    
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total miles driven
     */
    public int getDistanceDriven()
    {
        return this.distanceDriven;
    }
    
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(int gallons)
    {
        this.fuelConsumed += gallons;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public int getFuelConsumed()
    {
        return this.fuelConsumed;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public int getMileage()
    {
        int mileage = this.distanceDriven / this.fuelConsumed;
        return mileage;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        return this.vin;
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param vin    the vehicle identification (VIN) of this car
     */
    public void setVIN(String newVIN)
    {
        /*
         * When the paramter is named vin it shadows the instance variable.
         * 
         * Local and parameter variable with the same name as instance varaiables will override the instance vairbales.
         * In this case, the parameter gets assinged to and not the instance vairable.
         * 
         * To refer explicitly to an instance vairable, use "this".
         */
        // bad
        //vin = vin;
        
        //better
        //this.vin = vin;
        
        // best practice: name local and parameter vairables something differnet than instance varianbles
        this.vin = newVIN;
        
    }
    
    
    /*
     * The toString method is called automatically when Java needs to convert an object to a string.
     *      The method returns a string that, in most cases, contains all of the instance variables
     *      and thier values.
     *      
     *      For all classes it is recommended to implement (i.e., override) the toString method.
     *      
     *      The toString method header (i.e., signature) must match that of the object class to
     *      override it.  For example:
     */
    public String toString()
    {
        String str = "";
        str = "\nMileageTracker object: \nVIN: " + this.vin + "\nMiles Driven: " + this.distanceDriven + 
            " miles" + "\nFuel consumed: " + this.fuelConsumed + " gallons \nMileage: " + this.getMileage() +
            " mpg";
            // methods may be called from other methods using the "this." syntax.
        return str;
    }
    
}





