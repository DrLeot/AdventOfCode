package Year_2022.Day_1;

import Year_2022.Util.Elve;
import Year_2022.Util.FileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class DemoCaloriesPacker {

    public static String path = "src/main/resources/D1Q1.txt";

    public static void main(String[] args){

        ArrayList<Elve> elves = new ArrayList<>();
        Year_2022.Util.FileReader fileReader = new FileReader(path);
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

