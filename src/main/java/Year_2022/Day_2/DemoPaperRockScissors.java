package Year_2022.Day_2;

import Util.FileReader;

import java.io.*;
import java.util.ArrayList;

public class DemoPaperRockScissors {

    public static String path = "src/main/resources/D2Q1.txt";

    public static void main(String[] args){
        int sum_lowmode = 0;
        int sum_promode = 0;
        FileReader fileReader = new FileReader(path);
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line:lines) {
            sum_lowmode += new Battle(line.split(" ")[0],line.split(" ")[1], false).getResult();
            sum_promode += new Battle(line.split(" ")[0],line.split(" ")[1], true).getResult();
        }
        System.out.println(sum_lowmode);
        System.out.println(sum_promode);
    }
}
