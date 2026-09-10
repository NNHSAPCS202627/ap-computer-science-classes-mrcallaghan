import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;

public class WaterBottleTest
{
    @Test
    public void testDefaultConstructor()
    {
        WaterBottle bottle = new WaterBottle();

        assertEquals(Color.RED, bottle.getColor());
        assertEquals(0.0, bottle.getFluidAmount());
    }

    @Test
    public void testConstructor()
    {
        WaterBottle bottle = new WaterBottle(Color.BLUE, 24.5);

        assertEquals(Color.BLUE, bottle.getColor());
        assertEquals(24.5, bottle.getFluidAmount());
    }

    @Test
    public void testGetFluidAmount()
    {
        WaterBottle bottle = new WaterBottle(Color.GREEN, 12.75);

        assertEquals(12.75, bottle.getFluidAmount());
    }

    @Test
    public void testSetFluidAmount()
    {
        WaterBottle bottle = new WaterBottle();

        bottle.setFluidAmount(18.25);

        assertEquals(18.25, bottle.getFluidAmount());
    }

    @Test
    public void testGetColor()
    {
        WaterBottle bottle = new WaterBottle(Color.ORANGE, 10.0);

        assertEquals(Color.ORANGE, bottle.getColor());
    }

    @Test
    public void testSetColor()
    {
        WaterBottle bottle = new WaterBottle();

        bottle.setColor(Color.YELLOW);

        assertEquals(Color.YELLOW, bottle.getColor());
    }

    @Test
    public void testDrink()
    {
        WaterBottle bottle = new WaterBottle(Color.BLACK, 20.0);

        bottle.drink(6.5);

        assertEquals(13.5, bottle.getFluidAmount());
    }

    @Test
    public void testToString()
    {
        WaterBottle bottle = new WaterBottle(Color.CYAN, 16.0);

        assertEquals("Color: java.awt.Color[r=0,g=255,b=255] Fluid Amount: 16.0",
            bottle.toString());
    }
}