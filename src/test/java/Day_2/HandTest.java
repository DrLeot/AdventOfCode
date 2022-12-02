package Day_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {


    @Test
    public void testGetValue(){
        Hand hand = Hand.valueOf("A");
        assertEquals(1,hand.getValue());
    }
}