package Day_1;

import Util.Elve;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class DemoCaloriesPacker {

    public static String path = "src/main/resources/D1Q1.txt";

    public static void main(String[] args){

        ArrayList<Elve> elves = new ArrayList<>();

        // read file
        if(new File(path).exists()){
            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

                String line;
                ArrayList<Integer> calories = new ArrayList<>();
                while ((line = br.readLine()) != null) {
                    if(line.equals("")){ // change elve
                        elves.add(new Elve(calories,0,0));
                        calories = new ArrayList<>();
                        continue;
                    }
                    calories.add(Integer.parseInt(line));
                }

            }catch (IOException ioex){
                System.out.println(ioex);
            }


            for(int i = 0; i<3;i++){
                Elve max = Collections.max(elves);
                System.out.println("Place nr "+(i+1)+" : "+max.getSumBackpack());
                elves.remove(max);
            }

        }

    }

}
