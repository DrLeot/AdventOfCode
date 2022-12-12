package Year_2022.Day_8;

import Util.AbstractStarter;
import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoMap extends AbstractStarter {

    public DemoMap(){
        super("2022", "8", "Treetop Tree House","src/main/resources/2022/D8Q1.txt");
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

        Map map = new Map(lines.size(),lines.get(0).length(), lines);
        System.out.println(map.countVisible());
        System.out.println(map.getHighestViewScore());
    }

}
