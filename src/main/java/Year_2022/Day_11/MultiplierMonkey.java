package Year_2022.Day_11;

import java.util.ArrayList;

public class MultiplierMonkey extends Monkey{

    private final int multiplicator;

    public MultiplierMonkey(ArrayList<Integer> startingItems, final int divisor, final int multiplicator, final int returnPositive, final int returnNegative){
        super(startingItems, divisor,returnPositive, returnNegative);
        this.multiplicator = multiplicator;
    }

    @Override
    public int operation(int currentItem) {
        return currentItem * multiplicator;
    }



}
