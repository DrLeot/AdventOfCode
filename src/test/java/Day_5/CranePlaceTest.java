package Day_5;

import Year_2022.Day_5.CranePlace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CranePlaceTest {


    @Test
    public void testBlock(){
        CranePlace cranePlace = new CranePlace("" +
                "[ ] [D] [ ]\n" +
                "[N] [C] [ ]\n" +
                "[Z] [M] [P]", 3);

        cranePlace.moveBlock(2,1,1);
        cranePlace.moveBlock(1,3,3);
        cranePlace.moveBlock(2,1,2);
        cranePlace.moveBlock(1,2,1);
        assertEquals("MCD", cranePlace.getMessage());
    }

    @Test
    public void testSetup(){
        CranePlace cranePlace = new CranePlace("" +
                "[ ] [D] [ ]\n" +
                "[N] [C] [ ]\n" +
                "[Z] [M] [P]", 3);

        cranePlace.move(2,1,2);
        cranePlace.move(1,3,3);
        cranePlace.move(2,1,2);
        cranePlace.move(1,2,1);
        assertEquals("CMZ", cranePlace.getMessage());
    }

}