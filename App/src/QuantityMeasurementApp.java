public class QuantityMeasurementApp {

    static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            // Same reference check
            if (this == obj) {
                return true;
            }

            // Null and type check
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            // Safe casting
            Feet feet = (Feet) obj;

            // Floating point comparison
            return Double.compare(this.value, feet.value) == 0;
        }
    }

    public static void main(String[] args) {

        Feet firstValue = new Feet(1.0);
        Feet secondValue = new Feet(1.0);

        boolean result = firstValue.equals(secondValue);

        System.out.println("Equal : " + result);
    }
}
