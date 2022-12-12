package Year_2015.Day_1;

import Util.AbstractStarter;
import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoFloor extends AbstractStarter {

    public DemoFloor() {
        super("2015", "1", "Not Quite Lisp","src/main/resources/2015/D1Q1.txt");
    }

    @Override
    public void run() {
        int floorNumber = 0;
        FileReader fileReader = new FileReader(getInput());
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
