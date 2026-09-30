import java.awt.Color;

public class WaterBottle
{
    // instance variables
    private Color color;
    private double fluidAmount;
    // constants
    private final double OZ_TO_ML = 29.5735;
    
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
    
    // warm-up #5
    public void oz_to_ml()
    {
        //this.fluidAmount = this.fluidAmount * OZ_TO_ML;
        this.fluidAmount *= OZ_TO_ML;
    }
    
}