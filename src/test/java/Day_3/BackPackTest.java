package Day_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackPackTest {

    @Test
    public void testConstructor(){
        BackPack backPack = new BackPack("abcdef");
        assertEquals("abc",new String(backPack.getCompartmentLeft()));
        assertEquals("def",new String(backPack.getCompartmentRight()));
    }

    @Test
    public void testItemPriority() throws Exception {
        BackPack backPack = new BackPack("vJrwpWtwJgWrhcsFMMfFFhFp");
        assertEquals("vJrwpWtwJgWr", new String(backPack.getCompartmentLeft()));
        assertEquals("hcsFMMfFFhFp", new String(backPack.getCompartmentRight()));
        assertEquals('p',backPack.getPriorityItem());
        assertEquals(16,BackPack.getPriorityItemValue('p'));
    }

    @Test
    public void testConcatinationCompartments(){
        BackPack backPack = new BackPack("abcdef");
        assertEquals("abcdef", new String(backPack.getCompartment()));
    }

    @Test
    public void testGroupCompartmentCommon(){
        assertEquals('r', BackPack.getCommonCharacter(
                new BackPack("vJrwpWtwJgWrhcsFMMfFFhFp"),
                new BackPack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"),
                new BackPack("PmmdzqPrVvPwwTWBwg")
        ));
        assertEquals('Z', BackPack.getCommonCharacter(
                new BackPack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"),
                new BackPack("ttgJtRGJQctTZtZT"),
                new BackPack("CrZsJsPPZsGzwwsLwLmpwMDw")
        ));
    }
}