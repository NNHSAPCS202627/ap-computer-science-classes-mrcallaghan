import java.awt.Color;

public class WaterBottle
{
    // Warm-up #1: instance variables
    private Color color;
    private double fluidAmount;

    // Warm-up #2: default constructor
    public WaterBottle()
    {
        this.color = Color.RED;
        this.fluidAmount = 0.0;
    }

    // Warm-up #3: custom constructor
    public WaterBottle(Color initialColor, double initialFluidAmount)
    {
        this.color = initialColor;
        this.fluidAmount = initialFluidAmount;
    }

    // List of methods
    
    /*
     * Accessor method
     */
    public double getFluidAmount()
    {
        return this.fluidAmount;
    }
    
    /*
     * Mutator method
     */
    public void setFluidAmount(double newAmount)
    {
        this.fluidAmount = newAmount;
    }
    
    
    
    
    
    
    
    
    
    
}