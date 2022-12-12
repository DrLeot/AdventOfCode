package Year_2022.Day_11;

import java.util.ArrayList;

public class PowerMonkey extends Monkey{

    private final int power;

    public PowerMonkey(ArrayList<Integer> startingItems, final int divisor, final int power, final int returnPositive, final int returnNegative){
        super(startingItems, divisor,returnPositive, returnNegative);
        this.power = power;
    }

    @Override
    public int operation(int currentItem) {
        return (int)Math.pow(currentItem, power);
    }



}
