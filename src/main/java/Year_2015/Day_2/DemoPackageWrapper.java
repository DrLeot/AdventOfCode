package Year_2015.Day_2;

import Util.AbstractStarter;
import Util.DemoStarter;
import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoPackageWrapper extends AbstractStarter {


    public DemoPackageWrapper(){
        super("2015", "2", "I Was Told There Would Be No Math","src/main/resources/2015/D2Q1.txt");
    }

    @Override
    public void run() {
        FileReader fileReader = new FileReader(getInput());
        ArrayList<String> lines = new ArrayList<>();
        long sum = 0;
        long sumRibbon = 0;

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String line: lines){
            Present present = new Present(
                    Integer.parseInt(line.split("x")[0]),
                    Integer.parseInt(line.split("x")[1]),
                    Integer.parseInt(line.split("x")[2]));
            sum += present.getWrappingArea();
            sumRibbon += present.getRibbonLength();
        }
        System.out.println("Sum Paper needed: "+sum);
        System.out.println("Sum Ribbon needed: "+sumRibbon);
    }
}
