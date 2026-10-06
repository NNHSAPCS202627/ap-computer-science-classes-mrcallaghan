import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
This component constructs and draws car shapes.
 */
public class CarComponent extends JComponent  // make a custom Jcomponent called CarComponent
{  
    // instance variable to capture the animated objoect references
    private Car car1;
    
    public CarComponent()
    {
        this.car1 = new Car(0, 0);
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
        // cast to Graphics2D object (leave as first line of method)
        //      Think of the g2 like the Turtle pen
        Graphics2D g2 = (Graphics2D) g;  

        // initialize new Car object(s)
         
        
        // "this" is the JComponent (i.e., CarComponent)
        //      Similar to the Turtle's World
        int x = this.getWidth() - 60;
        int y = this.getHeight() - 30;

        Car car2 = new Car(x, y); 

        // draw cars
        this.car1.draw(g2);
        car2.draw(g2);      
    }
    
    /**
     * Update the objects such that they appear to be 
     *   animated when they are next drawn (repainted).
     */
    public void nextFrame()
    {
        // update Car objects for the next frame so they appear animated
        // ...
        this.car1.drive();
        // request that the Java Runtime repaints this component by invoking 
        //  the paintComponent method
        //  do not explicitly invoke the paintComponent method
        this.repaint();
    }
}
