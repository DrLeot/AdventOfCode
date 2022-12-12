package Year_2022.Day_11;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class MonkeyHandlerTest {


    @Test
    public void testExample(){
        MonkeyHandler monkeyHandler = new MonkeyHandler();

        monkeyHandler.addMonkey(
                new MultiplierMonkey(new ArrayList<>(Arrays.asList(79,98)),23,19, 2 ,3)
        );
        monkeyHandler.addMonkey(
                new AdditionMonkey(new ArrayList<>(Arrays.asList(54, 65, 75, 74)),19,6,2,0)
        );
        monkeyHandler.addMonkey(
                new PowerMonkey(new ArrayList<>(Arrays.asList(79, 60, 97)), 13,2,1,3)
        );
        monkeyHandler.addMonkey(
                new AdditionMonkey(new ArrayList<>(Arrays.asList(74)),17,3,0,1)
        );
        monkeyHandler.doRound(20);
        System.out.println(monkeyHandler.toString());
    }
}