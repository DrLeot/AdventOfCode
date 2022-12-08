package Year_2016.Day_1;

import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoFloor {
    public static final String PATH = "src/main/resources/2016/D1Q1.txt";

    public static void main(String[] args) {
        int floorNumber = 0;
        FileReader fileReader = new FileReader(PATH);
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] elements = lines.get(0).toCharArray();
        int idx = 0;
        for (char element:elements) {
            if (element == '('){
                floorNumber++;
            }
            if(element == ')'){
                floorNumber--;
            }
            if (floorNumber == -1){
                System.out.println("reached basement(-1) at "+ (idx+1));
            }

            idx++;
        }
        System.out.println(floorNumber);
    }
}
