
/**
 * Write a description of class MileageTrackerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MileageTrackerTester
{
    public static void main(String[] args)
    {
        
        // default MileageTracker object
        MileageTracker car1 = new MileageTracker();
        System.out.println(car1);
        
        // custom MileageTracker object
        MileageTracker car2 = new MileageTracker(100000, 10000);
        System.out.println(car2);
        
        
    }
}