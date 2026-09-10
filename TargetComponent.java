import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{  
    public TargetComponent()
    {        
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     */
    @Override
    public void paintComponent(Graphics g)
    {  
        Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object
        
        // Step 1: compile and run the main method in TargetViewer;
        //          verify that a window appears
        
        // Step 2: add code to create a new Ellipse2D.Double object
        //          and draw it using the g2 variable;
        //          verify that an ellipse appears
        
        
        // Step 3: remove code from step 2; implement the Target class;
        //          uncomment the following code;
        //          verify that your target appears

        // create targets
        //Target target1 = new Target();
        //Target target2 = new Target(200, 300);
        
        // draw targets
        //target1.draw(g2);
        //target2.draw(g2);      
    }
}
