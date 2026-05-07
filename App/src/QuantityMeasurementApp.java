public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength length1 =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength length2 =
                new QuantityLength(12.0, LengthUnit.INCH);

        System.out.println(length1.equals(length2));
        // Output: true

        QuantityLength length3 =
                new QuantityLength(1.0, LengthUnit.INCH);

        QuantityLength length4 =
                new QuantityLength(1.0, LengthUnit.INCH);

        System.out.println(length3.equals(length4));
        // Output: true
    }
}