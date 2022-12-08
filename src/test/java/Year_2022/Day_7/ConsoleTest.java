package Year_2022.Day_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleTest {


    @Test
    public void testPuzzleExample(){
        String input = "" +
                "$ ls\n" +
                "dir a\n" +
                "14848514 b.txt\n" +
                "8504156 c.dat\n" +
                "dir d\n" +
                "$ cd a\n" +
                "$ ls\n" +
                "dir e\n" +
                "29116 f\n" +
                "2557 g\n" +
                "62596 h.lst\n" +
                "$ cd e\n" +
                "$ ls\n" +
                "584 i\n" +
                "$ cd ..\n" +
                "$ cd ..\n" +
                "$ cd d\n" +
                "$ ls\n" +
                "4060174 j\n" +
                "8033020 d.log\n" +
                "5626152 d.ext\n" +
                "7214296 k";
        String[] lines = input.split("\n");
        Console console = new Console();
        for(String line:lines){
            console.execute(line);
        }
        assertEquals(95437,console.getFoldersSmallerThan());
        assertEquals(24933642, console.getClosestTo());
    }
}