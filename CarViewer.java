import javax.swing.JFrame;
/**
 * Example from the textbook on using Java graphics to construct custom objects. 
 *  Run the main method to view the program.
 */
public class CarViewer
{
    public static void main(String[] args)
    {
        // create frame object  (the pop-up window)
        JFrame frame = new JFrame();  

        // set frame attributes
        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initialize a CarComponent() component object
        CarComponent component = new CarComponent();

        // add the component to the frame and make visible
        frame.add(component);
        frame.setVisible(true);

        // execute 100 frames for the animation with a 1 second delay
        int frames = 100;
        int delay = 1000; // 1 second
        for(int i = 0; i < frames; i++)
        {
            // show the next frame in the animation
            component.nextFrame();
            try
            {
                // delay/pause for 1 second
                Thread.sleep( delay );
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
