import java.awt.Color;

public class WaterBottle
{
    // instance variables
    private Color color;
    private double fluidAmount;
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
    
    public void ozToMl()
    {
        this.fluidAmount *= OZ_TO_ML;
    }
    
    // warmup 6
    public void drink(double amountDrunk)
    {
        this.fluidAmount -= amountDrunk;
    }
    
    // warmup 7
    @Override
    public String toString()
    {
        String str = "Color: " + this.color + " Fluid Amount: " + this.getFluidAmount();
        //                                                          or this.fluidAmount
        return str;
    }
    
    
    
    
    
    

}