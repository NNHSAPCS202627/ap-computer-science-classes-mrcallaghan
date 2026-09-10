
/**
 * A class to create and use VendingMachine objects.
 *
 * @author 
 * @version 
 */
public class VendingMachineUser
{
    public static void main(String[] args)
    {
        System.out.println("---Test default constructor---");
        VendingMachine testMachine= new VendingMachine();
        int numberOfCans = testMachine.getCanCount();
        int numberOfTokens = testMachine.getTokenCount();
        System.out.println("Expected cans: " + 10 + "; Actual cans: " + numberOfCans);
        System.out.println("Expected tokens: " + 0 + "; Actual tokens: " + numberOfTokens);
                
        System.out.println("---Test fillUp method---");
        testMachine.fillUp(10);
        int newNumberOfCans = testMachine.getCanCount();
        System.out.println("Expected cans: " + 20 + "; Actual cans: " + newNumberOfCans);
        testMachine.fillUp(5);
        newNumberOfCans = testMachine.getCanCount();
        System.out.println("Expected cans: " + 25 + "; Actual cans: " + newNumberOfCans);
        
        System.out.println("---Test insertToken method---");
        numberOfCans = testMachine.getCanCount();
        numberOfTokens = testMachine.getTokenCount();
        testMachine.insertToken();
        newNumberOfCans = testMachine.getCanCount();
        int newNumberOfTokens = testMachine.getTokenCount();
        System.out.println("Expected cans: " + (numberOfCans - 1) + "; Actual cans: " + newNumberOfCans);
        System.out.println("Expected tokens: " + (numberOfTokens + 1) + "; Actual tokens: " + newNumberOfTokens);
        
        numberOfCans = testMachine.getCanCount();
        numberOfTokens = testMachine.getTokenCount();
        testMachine.insertToken();
        newNumberOfCans = testMachine.getCanCount();
        newNumberOfTokens = testMachine.getTokenCount();
        System.out.println("Expected cans: " + (numberOfCans - 1) + "; Actual cans: " + newNumberOfCans);
        System.out.println("Expected tokens: " + (numberOfTokens + 1) + "; Actual tokens: " + newNumberOfTokens);
        
        // System.out.println("---Test other constructor---");
        // VendingMachine testMachine2= new VendingMachine(20);
        // numberOfCans = testMachine2.getCanCount();
        // numberOfTokens = testMachine2.getTokenCount();
        // System.out.println("Expected cans: " + 20 + "; Actual cans: " + numberOfCans);
        // System.out.println("Expected tokens: " + 0 + "; Actual tokens: " + numberOfTokens);
    }
}
