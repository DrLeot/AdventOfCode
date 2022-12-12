package Year_2022.Day_11;

import java.util.ArrayList;

public abstract class Monkey {

    private final ArrayList<Integer> startingItems;
    private final int returnPositive;
    private final int returnNegative;
    private final int divisor;
    private int inHands;

    public Monkey(ArrayList<Integer> startingItems, int divisor, int returnPositive, int returnNegative){
        this.startingItems = startingItems;
        this.returnNegative = returnNegative;
        this.returnPositive = returnPositive;
        this.divisor = divisor;
    }

    public void addItem(int item){
        startingItems.add(item);
    }

    public int getInHands(){
        return this.inHands;
    }

    public final void doStep(){
        this.inHands = 0;
        if (startingItems.size() <= 0){
            return;
        }

        this.inHands = startingItems.remove(0);
        this.inHands = operation(this.inHands);
        this.inHands = Math.round((float) this.inHands / 3);
    }

    public abstract int operation(int currentItem);
    public int test(){
        if(getInHands()%getDivisor() == 0){
            return this.returnPositive;
        }else{
            return this.returnNegative;
        }
    };

    public int getDivisor() {
        return divisor;
    }
}
