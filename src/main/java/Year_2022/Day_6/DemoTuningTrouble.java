package Year_2022.Day_6;

import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoTuningTrouble {
    public static final String path = "src/main/resources/D6Q1.txt";
    public static final int BUFFERLENGTH = 4;
    public static final int BUFFERLENGTH2 = 14;

    public static void main(String[] args){
        FileReader fileReader = new FileReader(path);
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
