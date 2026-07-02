import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){

        Calculator c=new Calculator();

        assertEquals(8,c.add(5,3));

    }

    @Test
    public void testSubtract(){

        Calculator c=new Calculator();

        assertEquals(2,c.subtract(5,3));

    }

}