package Year_2022.Day_10;

import Util.AbstractStarter;
import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class SmallALUDemo extends AbstractStarter {

    public SmallALUDemo(){
        super("2022", "10", "Cathode-Ray Tube","src/main/resources/2022/D10Q1.txt");
    }

    @Override
    public void run() {
        final int[] outputCycles = new int[]{20,60,100,140,180,220};
        FileReader fileReader = new FileReader(getInput());
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SmallALU smallALU = new SmallALU(6,40);
        smallALU.operation(lines.toArray(String[]::new));

        int sum = 0;
        for (int outputCycle : outputCycles) {
            sum += (outputCycle * smallALU.getXByCycleNumber(outputCycle));
            System.out.println(outputCycle * smallALU.getXByCycleNumber(outputCycle));
        }
        System.out.println("sum: "+ sum);
        System.out.println(smallALU.toString());
    }

}
