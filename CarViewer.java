import javax.swing.JFrame;
/**
 * Example from the textbook on using Java graphics to construct custom objects. 
 *  Run the main method to view the program.
 */
public class CarViewer
{
    public static void main(String[] args) throws InterruptedException
    {
        // create frame object
        JFrame frame = new JFrame();  

        // set frame attributes
        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initialize a CarComponent() component object which is a JComponent and 
        //        is where all the drawing happend, sort of like the Turtle World (i.e., canvas)
        CarComponent component = new CarComponent();

        // add the component to the frame and make visible
        frame.add(component);
        frame.setVisible(true);

        for(int i = 0; i < 100; i++)
        {
            component.nextFrame();
            Thread.sleep( 1000 );
        }
    }
}
