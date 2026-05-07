import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // Feet Tests

    @Test
    void givenSameFeetValues_whenCompared_thenShouldReturnTrue() {

        assertTrue(
                QuantityMeasurementApp.areFeetEqual(1.0, 1.0)
        );
    }

    @Test
    void givenDifferentFeetValues_whenCompared_thenShouldReturnFalse() {

        assertFalse(
                QuantityMeasurementApp.areFeetEqual(1.0, 2.0)
        );
    }

    @Test
    void givenSameFeetReference_whenCompared_thenShouldReturnTrue() {

        QuantityMeasurementApp.Feet feet =
                new QuantityMeasurementApp.Feet(1.0);

        assertTrue(feet.equals(feet));
    }

    @Test
    void givenFeetValue_whenComparedWithNull_thenShouldReturnFalse() {

        QuantityMeasurementApp.Feet feet =
                new QuantityMeasurementApp.Feet(1.0);

        assertFalse(feet.equals(null));
    }

    @Test
    void givenFeetValue_whenComparedWithDifferentType_thenShouldReturnFalse() {

        QuantityMeasurementApp.Feet feet =
                new QuantityMeasurementApp.Feet(1.0);

        assertFalse(feet.equals("1.0"));
    }

    // Inches Tests

    @Test
    void givenSameInchesValues_whenCompared_thenShouldReturnTrue() {

        assertTrue(
                QuantityMeasurementApp.areInchesEqual(1.0, 1.0)
        );
    }

    @Test
    void givenDifferentInchesValues_whenCompared_thenShouldReturnFalse() {

        assertFalse(
                QuantityMeasurementApp.areInchesEqual(1.0, 2.0)
        );
    }

    @Test
    void givenSameInchesReference_whenCompared_thenShouldReturnTrue() {

        QuantityMeasurementApp.Inches inches =
                new QuantityMeasurementApp.Inches(1.0);

        assertTrue(inches.equals(inches));
    }

    @Test
    void givenInchesValue_whenComparedWithNull_thenShouldReturnFalse() {

        QuantityMeasurementApp.Inches inches =
                new QuantityMeasurementApp.Inches(1.0);

        assertFalse(inches.equals(null));
    }

    @Test
    void givenInchesValue_whenComparedWithDifferentType_thenShouldReturnFalse() {

        QuantityMeasurementApp.Inches inches =
                new QuantityMeasurementApp.Inches(1.0);

        assertFalse(inches.equals("1.0"));
    }
}