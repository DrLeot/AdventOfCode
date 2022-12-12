package Year_2022.Day_11;

import java.util.ArrayList;

public class MonkeyHandler {

    ArrayList<Monkey> monkeys = new ArrayList<>();

    public MonkeyHandler(){

    }

    public void addMonkey(Monkey monkey){
        monkeys.add(monkey);
    }

    public void doRound(int n){
        for(int i = 0; i < n;i++){
            doRound();
        }
    }

    public void doRound(){
        int idx = 0;
        for(Monkey monkey:monkeys){
            while (monkey.hasItems()){
                monkey.doStep();
                int throwto = monkey.test();
                monkeys.get(throwto).addItem(monkey.getInHands());
                //System.out.println("Item "+monkey.getInHands()+" will be thrown from"+idx+" to "+throwto);
            }
            idx++;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int idx = 0;
        for(Monkey monkey:monkeys){
            stringBuilder.append("Monkey "+idx+": "+monkey.toString()+"\n");
            idx++;
        }
        stringBuilder.append("----------------------");
        return stringBuilder.toString();
    }
}
