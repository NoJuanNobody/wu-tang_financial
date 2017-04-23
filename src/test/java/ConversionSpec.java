import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Alejandro on 4/23/17.
 */
public class ConversionSpec {

    @Test
    public void specGetConversionName(){
        String conversion = "USD";
        assertEquals(conversion, Conversion.USD.name());
    }

    @Test
    public void specGetConversion(){
        double conversion = 1.00;
        assertEquals(conversion, Conversion.USD.getConversion(), 0);
    }
}