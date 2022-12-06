package Day_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharStreamTest {


    @Test
    public void testHasDuplicates(){
        assertFalse(CharStream.hasDuplicates("abc".toCharArray()));
        assertFalse(CharStream.hasDuplicates("".toCharArray()));
        assertFalse(CharStream.hasDuplicates(" abc ".toCharArray())); // whitespace are ignored

        assertTrue(CharStream.hasDuplicates("aabbdeh".toCharArray()));
        assertTrue(CharStream.hasDuplicates("fgjzf".toCharArray()));

    }

    @Test
    public void testFirstUniqueApperanceIndex(){
        assertEquals(5,new CharStream("bvwbjplbgvbhsrlpgdmjqwftvncz").firstUniqueApperanceIndex(4));
        assertEquals(6,new CharStream("nppdvjthqldpwncqszvftbrmjlhg").firstUniqueApperanceIndex(4));
        assertEquals(10,new CharStream("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg").firstUniqueApperanceIndex(4));
        assertEquals(11,new CharStream("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw").firstUniqueApperanceIndex(4));

        assertEquals(19,new CharStream("mjqjpqmgbljsphdztnvjfqwrcgsmlb").firstUniqueApperanceIndex(14));
        assertEquals(23,new CharStream("bvwbjplbgvbhsrlpgdmjqwftvncz").firstUniqueApperanceIndex(14));
        assertEquals(23,new CharStream("nppdvjthqldpwncqszvftbrmjlhg").firstUniqueApperanceIndex(14));
        assertEquals(29,new CharStream("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg").firstUniqueApperanceIndex(14));
        assertEquals(26,new CharStream("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw").firstUniqueApperanceIndex(14));

    }
}