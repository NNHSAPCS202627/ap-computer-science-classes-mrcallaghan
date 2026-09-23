import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
This component constructs and draws car shapes.
 */
public class CarComponent extends JComponent
{  
    public CarComponent()
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
        // cast to Graphics2D object (leave as first line of method)
        //  Graphics2D object is like the Turtle pen - it draws on the canvas (i.e., JComponent)
        Graphics2D g2 = (Graphics2D) g;  

        // initialize new Car object(s)
        Car car1 = new Car(0, 0); 
        
        // in this case "this" is a JComponent, so you can run methods to query about it
        int x = this.getWidth() - 60;
        int y = this.getHeight() - 30;

        Car car2 = new Car(x, y); 

        // draw cars
        car1.draw(g2);
        car2.draw(g2);      
    }
}
