
/**
 * Write a description of class MileageTrackerMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MileageTrackerMain
{
    public static void main()
    {
        // client code goes here to call the default constructor
        MileageTracker car1 = new MileageTracker();
        System.out.println(car1);
        
        // create a second object with the customizable constructor
        MileageTracker car2 = new MileageTracker(100000, 50000);
        System.out.println(car2);
        
    }
}