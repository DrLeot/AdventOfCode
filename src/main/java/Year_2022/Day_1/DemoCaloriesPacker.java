package Year_2022.Day_1;

import Util.AbstractStarter;
import Year_2022.Util.Elve;
import Util.FileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class DemoCaloriesPacker extends AbstractStarter {

    public DemoCaloriesPacker(){
        super("2022", "1", "Calorie Counting","src/main/resources/2022/D1Q1.txt");
    }

    @Override
    public void run() {
        ArrayList<Elve> elves = new ArrayList<>();
        FileReader fileReader = new FileReader(getInput());
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<Integer> calories = new ArrayList<>();
        // read file
        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line:lines) {
            if(line.equals("")){ // change elve
                elves.add(new Elve(calories,0,0));
                calories = new ArrayList<>();
                continue;
            }
            calories.add(Integer.parseInt(line));
        }

        for(int i = 0; i<3;i++){
            Elve max = Collections.max(elves);
            System.out.println("Place nr "+(i+1)+" : "+max.getSumBackpack());
            elves.remove(max);
        }
    }
}

