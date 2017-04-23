/**
 * Created by Alejandro on 4/23/17.
 */
public enum Conversion {
    USD(1.00),
    EURO(0.94);

    private double value;

    Conversion(double value){
        this.value = value;
    }

    public double getConversion(){
        return value;
    }

}
