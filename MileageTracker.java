/**
 * This class models a mileage tracker for a car. Think of it like the software system inside the dashboard of a car.
 *
 * @author mrcallaghan
 * @version 14sep2026
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables, or attributes (to store the object's attributes):
     *      - specify the visibility (e.g, private)
     *          - public: accessible by any code in any class
     *          - private: only accesible by method in this class
     *      - specify the type (e.g., int, double, String, Turtle)
     *      - specify the name (e.g., distanceDriven)
     *      
     *      Instance variables differ from local variables in the following ways:
     *          - scoped to the entire class (accessible in any instance method in the class)
     *          - lifetime is the same as the object
     *          - automatically initialized to default value (0, false, null)
     *          - best practice is not to immediately initialize instance variables
     */
    private int distanceDriven;     // in units of miles
    private int fuelConsumed;       // in units of gallons
    private String vin;             // vehicle identification number

    /*
     * 3. Define the constructor(s) to initialize objects:
     *       responsible for initializing the newly created object
     *       invoked automatically via the new operator
     *       name of the consturctor must match the name of the class
     *       has no return type (not even void)
     *       multiple constructors may be defined for a class
     */
    
    /**
     * Default constructor intitializes a MileageTracker obejct with 0 miles driven, 0 fuel consumed, and a null vin.
     */
    public MileageTracker()
    {
        /*
         * The "this" reserved word references the current object (like "self" in Python).
         *      Its usage is highly encouraged, but not required.
         */
        this.distanceDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
        System.out.println("Default constructor is running...");
    }
    
    /**
     * Overloaded constructor constructs a MileageTracker object with the specifed miels driven and fuel consumed.
     * 
     * @param initialDistanceDriven  the initial mileage of the car
     * @param intialFuelConsumed     the initial fuel consumed by the car
     */
    public MileageTracker(int initialDistanceDriven, int initialFuelConsumed)
    {
        this.distanceDriven =  initialDistanceDriven;
        this.fuelConsumed = initialFuelConsumed;
        this.vin = null;
        System.out.println("Custom constructor is running...");
    }
    
    /*
     * 1. Define methods by specifying:
     *      - the visiblity (e.g., public, private, protected, etc.)
     *      - the return type (e.g., void, int, double, String, etc.)
     *      - the method name (e.g, incrementDistanceDriven, getDistanceDriven)
     *      - the parameters and their type (e.g., miles of type int)
     */
    
    /**
     * Increments the number of miles that the car has driven.
     * 
     * @param miles the additional miles that the car has driven.
     */
    public void incrementDistanceDriven(int miles)
    {
        //this.distanceDriven = this.distanceDriven + miles;
        this.distanceDriven += miles;
    }
    
    /**
     * Returns the total number of miles the car has driven.
     * 
     * @return the total number of miles driven.
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
         * When a local or parameter variable has the same name as an instance variable, it "shadows" it.
         * 
         *      In this case, the vin assigned to is the parameter vin, not the intended instance 
         *      variable vin.
         *      
         *      To refer explicitly to the instance variable, use "this".
         */
        // bad
        vin = vin;
        
        // better
        this.vin = vin;
        
        // best practice: name local and parameter variables something else (not the instance variable name)
        this.vin = newVIN;
    }

}





