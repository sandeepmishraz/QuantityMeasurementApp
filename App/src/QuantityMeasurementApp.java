public class QuantityMeasurementApp {

    static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Feet feet = (Feet) obj;

            return Double.compare(this.value, feet.value) == 0;
        }
    }

    static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Inches inches = (Inches) obj;

            return Double.compare(this.value, inches.value) == 0;
        }
    }

    public static boolean areFeetEqual(double firstValue,
                                       double secondValue) {

        Feet firstFeet = new Feet(firstValue);
        Feet secondFeet = new Feet(secondValue);

        return firstFeet.equals(secondFeet);
    }

    public static boolean areInchesEqual(double firstValue,
                                         double secondValue) {

        Inches firstInches = new Inches(firstValue);
        Inches secondInches = new Inches(secondValue);

        return firstInches.equals(secondInches);
    }

    public static void main(String[] args) {

        boolean feetResult = areFeetEqual(1.0, 1.0);
        boolean inchesResult = areInchesEqual(1.0, 1.0);

        System.out.println("Feet Equal : " + feetResult);
        System.out.println("Inches Equal : " + inchesResult);
    }
}