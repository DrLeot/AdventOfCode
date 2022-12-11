package Year_2022.Day_8;

import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoMap {
    public static final String path = "src/main/resources/D8Q1.txt";

    public static void main(String[] args){
        FileReader fileReader = new FileReader(path);
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map map = new Map(lines.size(),lines.get(0).length(), lines);
        System.out.println(map.countVisible());
        System.out.println(map.getHighestViewScore());
    }
}
