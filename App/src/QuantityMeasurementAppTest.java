import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void givenSameFeetValues_whenCompared_thenShouldReturnTrue() {

        QuantityMeasurementApp.Feet firstValue =
                new QuantityMeasurementApp.Feet(1.0);

        QuantityMeasurementApp.Feet secondValue =
                new QuantityMeasurementApp.Feet(1.0);

        assertTrue(firstValue.equals(secondValue));
    }

    @Test
    void givenDifferentFeetValues_whenCompared_thenShouldReturnFalse() {

        QuantityMeasurementApp.Feet firstValue =
                new QuantityMeasurementApp.Feet(1.0);

        QuantityMeasurementApp.Feet secondValue =
                new QuantityMeasurementApp.Feet(2.0);

        assertFalse(firstValue.equals(secondValue));
    }

    @Test
    void givenFeetValue_whenComparedWithNull_thenShouldReturnFalse() {

        QuantityMeasurementApp.Feet value =
                new QuantityMeasurementApp.Feet(1.0);

        assertFalse(value.equals(null));
    }

    @Test
    void givenFeetValue_whenComparedWithDifferentType_thenShouldReturnFalse() {

        QuantityMeasurementApp.Feet value =
                new QuantityMeasurementApp.Feet(1.0);

        String nonNumericInput = "1.0";

        assertFalse(value.equals(nonNumericInput));
    }

    @Test
    void givenSameReference_whenCompared_thenShouldReturnTrue() {

        QuantityMeasurementApp.Feet value =
                new QuantityMeasurementApp.Feet(1.0);

        assertTrue(value.equals(value));
    }
}