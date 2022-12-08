package Year_2016.Day_2;

import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoPackageWrapper {

    public static final String PATH = "src/main/resources/2016/D2Q1.txt";

    public static void main(String[] args){
        FileReader fileReader = new FileReader(PATH);
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
