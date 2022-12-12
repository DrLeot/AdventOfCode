package Year_2022.Day_11;

import java.util.ArrayList;

public class MonkeyHandler {

    ArrayList<Monkey> monkeys = new ArrayList<Monkey>();

    public MonkeyHandler(){
        ArrayList<Integer> items = new ArrayList<>();
        items.add(79);
        items.add(98);
        monkeys.add(new MultiplierMonkey(items,23,19, 2 ,3));

        for(Monkey monkey:monkeys){
            monkey.doStep();
            int throwto = monkey.test();
            monkeys.get(throwto).addItem(monkey.getInHands());
        }
    }
}
