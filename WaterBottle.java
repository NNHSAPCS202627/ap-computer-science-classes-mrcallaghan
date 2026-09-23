import java.awt.Color;

public class WaterBottle
{
    // instance variables
    private Color color;
    private double fluidAmount;
    
    // default constructor
    public WaterBottle()
    {
        this.color = Color.RED;
        this.fluidAmount = 0.0;
    }
    
    // custom constructor
    public WaterBottle(Color initialColor, double initialFluidAmount)
    {
        this.color = initialColor;
        this.fluidAmount = initialFluidAmount;
    }
    
    // subsequent warmups: methods
    // accessor 
    public double getFluidAmount()
    {
        return this.fluidAmount;
    }
    
    // mutator
    public void setFluidAmount(double newAmount)
    {
        this.fluidAmount = newAmount;
    }
    
    
    
    
    
    
    
    
    

}