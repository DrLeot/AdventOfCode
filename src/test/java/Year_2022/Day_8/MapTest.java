package Year_2022.Day_8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {


    @Test
    public void testSingleVisible(){
        ArrayList<String> lines = new ArrayList<>();
        lines.add("30373");
        lines.add("25512");
        lines.add("65332");
        lines.add("33549");
        lines.add("35390");
        Map map = new Map(5,5, lines);
        assertEquals(21,map.countVisible());
    }
}