package Day_2;

import Year_2022.Day_2.Battle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {


    @Test
    public void testBattleLow(){
        assertEquals(8, new Battle("A","Y", false).getResult());
        assertEquals(1, new Battle("B","X",false).getResult());
        assertEquals(6, new Battle("C","Z",false).getResult());
    }

    @Test
    public void testBattleHigh(){
        assertEquals(4, new Battle("A","Y", true).getResult());
        assertEquals(1, new Battle("B","X",true).getResult());
        assertEquals(7, new Battle("C","Z",true).getResult());

    }
}