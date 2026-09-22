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
     *      - specify the visibility (e.g., private, public)
     *              public: accessible by any code in any class
     *              private: only accessible by methods in this class
     *      - specify the type (e.g., int, double, String, Turtle)
     *      - specify the name (e.g., distanceDriven)
     *      
     *      Instance variables differ from local variables in the following ways:
     *          - scoped to the class (accessible in all methods of the class)
     *          - lifetime is the same as the object
     *          - automatically initialized to a default value (0, false, null)
     *          - best practice is to not immediately initialize them
     */
    private int distanceDriven;     // in units of miles
    private int fuelConsumed;       // in units of gallons
    private String vin;             // vehicle identification number


    /*
     * 3. Define the constructor(s) to initialize objects:
     *      - responsible for initializing the newly created objects
     *      - invoked automatically via the new operator
     *      - name of the constructor must match the name of the class
     *      - has no return type( not even void)
     *      - multiple constructors can be defined for a class
     *      - one constructor may call on another (with restrictions)
     */
    
    /**
     * Default constructor for the MileageTracker class.
     *      Initializes the objects miles driven to 0 and fuel consumed to 0 and vin to null (all default values).
     */
    public MileageTracker()
    {
        /*
         * The "this" reserved word references the current object (like 'self' in Python).
         * Its usage is highly encouraged, but not always required.
         */
        this.distanceDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
        System.out.println("Executing default constructor in the Mileagetracker class...");
    }
    
    /**
     * Constructs a new MileageTracker with an inital miels driven and fuel consumed.
     * 
     * @param intialDistanceDriven the numbe rof miles the car has already driven
     * @param intialFuelConsumed the number of gallons of gas already consumed
     */
    public MileageTracker(int initialDistanceDriven, int intialFuelConsumed)
    {
        this.distanceDriven = initialDistanceDriven;
        this.fuelConsumed = intialFuelConsumed;
        this.vin = null;
        System.out.println("Executing overloaded constructor in the Mileagetracker class...");
    }
    
    /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public, private)
     *      the return type (e.g., void, int, String, etc.)
     *      the method name (e.g., incrementDistanceDriven, getDistanceDriven)
     *      the parameters and thier type (e.g., miles)
     */
    /**
     * Incements the number of miles that the car has driven.
     * 
     * @param miles the additional distance, in miles, this car has driven
     */
    public void incrementDistanceDriven(int miles)
    {
        //this.distanceDriven = this.distanceDriven + miles;
        this.distanceDriven += miles;
    }
    
    /**
     * Returns the total number of miles driven.
     * 
     * @return the total number of miles driven
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
         * When the paramter is names 'vin', it shadows the instance variable 'this.vin'.
         * 
         * Local and parameter variables "shadow" an instance variable of the same name.  In this code,
         *  vin would refer to the parameter vin, not the instance variable.
         *  
         *  To refer explicitly to the instance variable vin, use "this."
         *  
         *  Better practice: name parameters and instance variables unique name!
         */
        // bad
        //vin = vin;
        
        //better
        //this.vin = vin;
        
        // best
        this.vin = newVIN;
    }
    
    /*
     * The toString method is called automatically when Java needs to convert the object to a String.
     *      The toString method returns a string that contains, in general, all of the instance
     *      variables and thier current values.
     *      
     *      The method signature MUST match that of the object class, as follows:
     */
    public String toString()
    {
        String str = "";
        str = "\nMileage Tracker: " + "\nVIN: " + this.vin +
        "\nDistance Driven: " + this.getDistanceDriven() + " miles" +
        "\nFuel Consumed: " + this.getFuelConsumed() + " gallons";
        //"\nMileage: " + this.getMileage() + "mpg";
        return str;
        
        // NOTE: you can call methods from other methods using the "this." syntax; same as we 
        //      do for instance variables.
    }
    
    
}






