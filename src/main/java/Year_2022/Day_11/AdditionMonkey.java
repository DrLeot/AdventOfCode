package Year_2022.Day_11;

import java.util.ArrayList;

public class AdditionMonkey extends Monkey{

    private final int additor;

    public AdditionMonkey(ArrayList<Integer> startingItems, final int divisor, final int additor, final int returnPositive, final int returnNegative){
        super(startingItems, divisor,returnPositive, returnNegative);
        this.additor = additor;
    }

    @Override
    public int operation(int currentItem) {
        return currentItem + additor;
    }



}
