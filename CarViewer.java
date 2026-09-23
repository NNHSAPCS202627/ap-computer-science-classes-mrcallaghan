import javax.swing.JFrame;
/**
 * Example from the textbook on using Java graphics to construct custom objects. 
 *  Run the main method to view the program.
 */
public class CarViewer
{
   public static void main(String[] args)
   {
      // create frame object
       JFrame frame = new JFrame();  
       
      // set frame attributes
      frame.setSize(300, 400);
      frame.setTitle("Two cars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // initialize a CarComponent() component object (this is like the Canvas you draw on, 
      //                                                kind of like a Turtle World)
      CarComponent component = new CarComponent();
      
      // add the component to the frame and make visible
      frame.add(component);
      frame.setVisible(true);
   }
}
