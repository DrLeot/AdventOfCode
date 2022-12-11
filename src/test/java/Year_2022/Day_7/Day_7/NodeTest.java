package Year_2022.Day_7.Day_7;

import Year_2022.Day_7.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {


    @Test
    public void testDirectory(){
        assertEquals(0,new Node("/", null).getSize());
    }

    @Test
    public void testDirectoryWithFiles(){
        Node root = new Node("/", null);
        root.add(new Node("filea", 10,root));
        root.add(new Node("fileb", 15,root));
        assertEquals(25,root.getSize());
        assertEquals(25,root.getSize());
    }

    @Test
    public void testDirectoryWithSubDirectory(){
        Node root = new Node("/", null);
        root.add(new Node("subdir", root));
        assertEquals(0,root.getSize());
        assertEquals("subdir",root.getChilds().get(0).getName());
    }
}