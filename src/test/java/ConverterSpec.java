import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Alejandro on 4/23/17.
 */
public class ConverterSpec {
    Converter converter = new Converter();

    @Test
    public void convertToDollarsSpec(){
        double expected=  3.00/1.00;
        double actual = converter.convertDollars(3);
        assertEquals(actual, expected, 0.1);
    }

    @Test
    public void convertToEurosSpec(){
        double expected = 3.00/.94;
        double actual = converter.convertEuros(3);
        assertEquals(actual, expected, 0.1);
    }

}
