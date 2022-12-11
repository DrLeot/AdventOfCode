package Year_2022.Day_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    private Map map;

    @BeforeEach
    public void setup(){
        ArrayList<String> lines = new ArrayList<>();
        lines.add("30373");
        lines.add("25512");
        lines.add("65332");
        lines.add("33549");
        lines.add("35390");
        map = new Map(5,5, lines);
    }

    @Test
    public void testVisibleAll(){
        assertEquals(21,map.countVisible());
    }

    @Test
    public void testSingleScore(){
        assertEquals(4, map.getViewScore(1,2));
        assertEquals(8, map.getViewScore(3,2));
    }
}