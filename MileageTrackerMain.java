
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
        // using the default constuctor
        MileageTracker car1 = new MileageTracker();
        System.out.println(car1);
        
        // using the custom constructor
        MileageTracker car2 = new MileageTracker(116000, 10000);
        System.out.println(car2);
    }
}