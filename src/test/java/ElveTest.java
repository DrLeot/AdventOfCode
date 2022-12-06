import Year_2022.Util.Elve;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ElveTest {

    @Test
    public void testBackPackSum(){
        Elve elve = new Elve(new ArrayList<>(Arrays.asList(1000,2000,3000)),0,0);
        assertEquals(6000,elve.getSumBackpack());
    }

    @Test
    public void testBackPackSumZero(){
        Elve elve = new Elve(new ArrayList<>(),0,0);
        assertEquals(0,elve.getSumBackpack());
    }

    @Test
    public void testCleanUpIntersection(){
        assertTrue(Elve.SectionIntersects(
                new Elve(new ArrayList<>(), 2,6),
                new Elve(new ArrayList<>(), 4,8)));
        assertTrue(Elve.SectionIntersects(
                new Elve(new ArrayList<>(), 6,6),
                new Elve(new ArrayList<>(), 4,6)));
        assertTrue(Elve.SectionIntersects(
                new Elve(new ArrayList<>(), 2,8),
                new Elve(new ArrayList<>(), 3,7)));
        assertTrue(Elve.SectionIntersects(
                new Elve(new ArrayList<>(), 5,7),
                new Elve(new ArrayList<>(), 7,9)));
        assertFalse(Elve.SectionIntersects(
                new Elve(new ArrayList<>(), 2,3),
                new Elve(new ArrayList<>(), 4,5)));
        assertFalse(Elve.SectionIntersects(
                new Elve(new ArrayList<>(), 2,4),
                new Elve(new ArrayList<>(), 6,8)));
    }

    @Test
    public void testCleanUpOverlap(){
        assertFalse(Elve.SectionOverlaps(
                new Elve(new ArrayList<>(), 2,6),
                new Elve(new ArrayList<>(), 4,8)));
        assertTrue(Elve.SectionOverlaps(
                new Elve(new ArrayList<>(), 6,6),
                new Elve(new ArrayList<>(), 4,6)));
        assertTrue(Elve.SectionOverlaps(
                new Elve(new ArrayList<>(), 2,8),
                new Elve(new ArrayList<>(), 3,7)));
        assertFalse(Elve.SectionOverlaps(
                new Elve(new ArrayList<>(), 5,7),
                new Elve(new ArrayList<>(), 7,9)));
        assertFalse(Elve.SectionOverlaps(
                new Elve(new ArrayList<>(), 2,3),
                new Elve(new ArrayList<>(), 4,5)));
        assertFalse(Elve.SectionOverlaps(
                new Elve(new ArrayList<>(), 2,4),
                new Elve(new ArrayList<>(), 6,8)));
    }
}