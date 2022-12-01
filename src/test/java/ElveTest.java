import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ElveTest {

    @Test
    public void testBackPackSum(){
        Elve elve = new Elve(new ArrayList<>(Arrays.asList(1000,2000,3000)));
        assertEquals(6000,elve.getSumBackpack());
    }

    @Test
    public void testBackPackSumZero(){
        Elve elve = new Elve(new ArrayList<>());
        assertEquals(0,elve.getSumBackpack());
    }
}