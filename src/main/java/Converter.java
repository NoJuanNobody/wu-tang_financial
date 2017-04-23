/**
 * Created by Alejandro on 4/23/17.
 */
public class Converter {

    public double convertDollars(double value){
        return value / Conversion.USD.getConversion();
    }

    public double convertEuros(double value){
        return value / Conversion.EURO.getConversion();
    }
}
