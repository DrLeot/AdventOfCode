import java.util.ArrayList;
import java.util.List;

public class Elve {

    private final List<Integer> backpack;

    public Elve(List<Integer> backpack){
        this.backpack = backpack;
    }
    
    public int getSumBackpack(){
        return backpack.stream().mapToInt(Integer::intValue).sum();
    }
}
