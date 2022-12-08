package Year_2016.Day_3;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {


    @Test
    public void testEquals(){
        HashSet<House> houses = new HashSet<>();

        assertTrue(houses.add(new House(0,0)));
        assertTrue(houses.add(new House(1,1)));
        assertFalse(houses.add(new House(0,0)));
        assertFalse(houses.add(new House(1,1)));
    }
}