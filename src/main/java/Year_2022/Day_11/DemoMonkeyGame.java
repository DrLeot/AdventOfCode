package Year_2022.Day_11;

import Util.AbstractStarter;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoMonkeyGame extends AbstractStarter {

    public DemoMonkeyGame(){
        super("2022", "11", "Monkey in the Middle","src/main/resources/2022/D11Q1.txt");
    }

    @Override
    public void run() {
        MonkeyHandler monkeyHandler = new MonkeyHandler();

        monkeyHandler.addMonkey(
                new MultiplierMonkey(new ArrayList<>(Arrays.asList(80)),2,5, 4 ,3)
        );
        monkeyHandler.addMonkey(
                new AdditionMonkey(new ArrayList<>(Arrays.asList(75, 83, 74)),7,7, 5 ,6)
        );
        monkeyHandler.addMonkey(
                new AdditionMonkey(new ArrayList<>(Arrays.asList(86, 67, 61, 96, 52, 63, 73)),3,5, 7 ,0)
        );
        monkeyHandler.addMonkey(
                new AdditionMonkey(new ArrayList<>(Arrays.asList(85, 83, 55, 85, 57, 70, 85, 52)),17,8, 1 ,5)
        );
        monkeyHandler.addMonkey(
                new AdditionMonkey(new ArrayList<>(Arrays.asList(67, 75, 91, 72, 89)),11,4, 3 ,1)
        );
        monkeyHandler.addMonkey(
                new MultiplierMonkey(new ArrayList<>(Arrays.asList(66, 64, 68, 92, 68, 77)),19,2, 6 ,2)
        );
        monkeyHandler.addMonkey(
                new PowerMonkey(new ArrayList<>(Arrays.asList(97, 94, 79, 88)),5,2, 2 ,7)
        );
        monkeyHandler.addMonkey(
                new AdditionMonkey(new ArrayList<>(Arrays.asList(77, 85)),13,6, 4 ,0)
        );
        monkeyHandler.doRound(20);
        System.out.println(monkeyHandler);

    }
}
