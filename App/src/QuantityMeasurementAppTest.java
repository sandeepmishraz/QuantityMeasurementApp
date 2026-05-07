import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityLengthTest {

    @Test
    void testEquality_FeetToFeet_SameValue() {

        QuantityLength length1 =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength length2 =
                new QuantityLength(1.0, LengthUnit.FEET);

        assertEquals(length1, length2);
    }

    @Test
    void testEquality_InchToInch_SameValue() {

        QuantityLength length1 =
                new QuantityLength(1.0, LengthUnit.INCH);

        QuantityLength length2 =
                new QuantityLength(1.0, LengthUnit.INCH);

        assertEquals(length1, length2);
    }

    @Test
    void testEquality_FeetToInch_EquivalentValue() {

        QuantityLength feet =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength inch =
                new QuantityLength(12.0, LengthUnit.INCH);

        assertEquals(feet, inch);
    }

    @Test
    void testEquality_InchToFeet_EquivalentValue() {

        QuantityLength inch =
                new QuantityLength(12.0, LengthUnit.INCH);

        QuantityLength feet =
                new QuantityLength(1.0, LengthUnit.FEET);

        assertEquals(inch, feet);
    }

    @Test
    void testEquality_FeetToFeet_DifferentValue() {

        QuantityLength length1 =
                new QuantityLength(1.0, LengthUnit.FEET);

        QuantityLength length2 =
                new QuantityLength(2.0, LengthUnit.FEET);

        assertNotEquals(length1, length2);
    }

    @Test
    void testEquality_InchToInch_DifferentValue() {

        QuantityLength length1 =
                new QuantityLength(1.0, LengthUnit.INCH);

        QuantityLength length2 =
                new QuantityLength(2.0, LengthUnit.INCH);

        assertNotEquals(length1, length2);
    }

    @Test
    void testEquality_SameReference() {

        QuantityLength length =
                new QuantityLength(1.0, LengthUnit.FEET);

        assertEquals(length, length);
    }

    @Test
    void testEquality_NullComparison() {

        QuantityLength length =
                new QuantityLength(1.0, LengthUnit.FEET);

        assertNotEquals(null, length);
    }

    @Test
    void testEquality_InvalidUnit() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new QuantityLength(1.0, null)
        );

        assertEquals("Unit cannot be null", exception.getMessage());
    }
}