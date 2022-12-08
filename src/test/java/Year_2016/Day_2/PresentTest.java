package Year_2016.Day_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PresentTest {


    @Test
    public void testArea(){
        assertEquals(52, new Present(2,3,4).getArea());
        assertEquals(42, new Present(1,1,10).getArea());
    }

    @Test
    public void testSmallesArea(){
        assertEquals(6, new Present(2,3,4).getSmallestArea());
        assertEquals(1, new Present(1,1,10).getSmallestArea());
    }

    @Test
    public void testRibbonLength(){
        assertEquals(34, new Present(2,3,4).getRibbonLength());
        assertEquals(14, new Present(1,1,10).getRibbonLength());
    }


}