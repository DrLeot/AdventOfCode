package Year_2022.Day_2;

import Util.AbstractStarter;
import Util.DemoStarter;
import Util.FileReader;

import java.io.*;
import java.util.ArrayList;

public class DemoPaperRockScissors extends AbstractStarter {

    public static String path = "src/main/resources/D2Q1.txt";

    public DemoPaperRockScissors(){
        super("2022", "2", "Rock Paper Scissors","src/main/resources/2022/D2Q1.txt");
    }

    @Override
    public void run() {
        int sumLowmode = 0;
        int sumPromode = 0;
        FileReader fileReader = new FileReader(path);
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line:lines) {
            sumLowmode += new Battle(line.split(" ")[0],line.split(" ")[1], false).getResult();
            sumPromode += new Battle(line.split(" ")[0],line.split(" ")[1], true).getResult();
        }
        System.out.println(sumLowmode);
        System.out.println(sumPromode);
    }
}
