package Year_2022.Day_6;

import Util.AbstractStarter;
import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoTuningTrouble extends AbstractStarter {

    public final int BUFFERLENGTH = 4;
    public final int BUFFERLENGTH2 = 14;

    public DemoTuningTrouble(){
        super("2022", "6", "Tuning Trouble","src/main/resources/2022/D6Q1.txt");
    }

    @Override
    public void run() {
        FileReader fileReader = new FileReader(getInput());
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new CharStream(lines.get(0)).firstUniqueApperanceIndex(BUFFERLENGTH));
        System.out.println(new CharStream(lines.get(0)).firstUniqueApperanceIndex(BUFFERLENGTH2));
    }

}
