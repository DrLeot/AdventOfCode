package Year_2022.Day_7.Day_2;

import Year_2022.Day_2.Hand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {


    @Test
    public void testGetValue(){
        Hand hand = Hand.valueOf("A");
        assertEquals(1,hand.getValue());
    }
}