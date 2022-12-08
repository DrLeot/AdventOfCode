package Year_2022.Day_7;

import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoConsole {
    public static final String path = "src/main/resources/D7Q1.txt";

    public static void main(String[] args){
        Console console = new Console();
        FileReader fileReader = new FileReader(path);
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String line:lines){
            console.execute(line);
        }

        System.out.println(console.getFoldersSmallerThan());
        //System.out.println(console.getClosestTo());
    }

}
