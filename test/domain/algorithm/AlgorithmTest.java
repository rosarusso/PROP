package domain.algorithm;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {
    @Test
    void checkDistanceBetweenNumericValues() {
        assertEquals(Algorithm.getDistance(0, 10, 0, 10), 1);
        assertEquals(Algorithm.getDistance(1, 1, 0, 10), 0);
        assertEquals(Algorithm.getDistance(0, 2, 0, 4), .5);
    }

    @Test
    void checkDistanceBetweenPossibilities() {
        assertEquals(Algorithm.getDistance("mid", "mid", new ArrayList<>(Arrays.asList("low", "mid", "high"))), 0);
        assertEquals(Algorithm.getDistance("mid", "high", new ArrayList<>(Arrays.asList("low", "mid", "high"))), .5);
        assertEquals(Algorithm.getDistance("low", "high", new ArrayList<>(Arrays.asList("low", "mid", "high"))), 1);
    }

    @Test
    void checkDistanceBetweenWords() {
        assertEquals(Algorithm.getDistance("test", "test"), 0);
        assertEquals(Algorithm.getDistance("test", "TEST"), 0);
        assertEquals(Algorithm.getDistance("test", "notest"), 1);
    }

    @Test
    void checkDistanceBetweenSets() {
        assertEquals(Algorithm.getDistance(new HashSet<>(Arrays.asList("red", "green", "blue")), new HashSet<>(Arrays.asList("red", "green", "blue"))), 0);
        assertEquals(Algorithm.getDistance(new HashSet<>(Arrays.asList("red", "green")), new HashSet<>(Arrays.asList("blue", "black"))), 1);
        assertEquals(Algorithm.getDistance(new HashSet<>(Arrays.asList("red", "green", "blue")), new HashSet<>(Arrays.asList("green", "blue", "black"))), .5);
    }

    @Test
    void checkDistanceBetweenFreeStrings() {
        assertEquals(Algorithm.getDistanceFree("test", "test"), 0);
        assertEquals(new BigDecimal(Algorithm.getDistanceFree("kitten", "sitting")).setScale(3, BigDecimal.ROUND_HALF_EVEN), new BigDecimal(2.0 / 6).setScale(3, BigDecimal.ROUND_HALF_EVEN));
        assertEquals(new BigDecimal(Algorithm.getDistanceFree("rosettacode", "raisethysword")).setScale(3, BigDecimal.ROUND_HALF_EVEN), new BigDecimal(6.0 / 11).setScale(3, BigDecimal.ROUND_HALF_EVEN));
    }
}