package Year_2022.Day_7;

import Util.AbstractStarter;
import Util.DemoStarter;
import Util.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class DemoConsole extends AbstractStarter {

    public DemoConsole(){
        super("2022", "7", "No Space Left On Device","src/main/resources/2022/D7Q1.txt");
    }

    @Override
    public void run() {
        Console console = new Console();
        FileReader fileReader = new FileReader(getInput());
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
    }

}
