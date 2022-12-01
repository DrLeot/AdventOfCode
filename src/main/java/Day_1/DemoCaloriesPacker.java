package Day_1;

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
                        elves.add(new Elve(calories));
                        calories = new ArrayList<>();
                        continue;
                    }
                    calories.add(Integer.parseInt(line));
                }

            }catch (IOException ioex){
                System.out.println(ioex);
            }

            System.out.println(Collections.max(elves).getSumBackpack());

        }

    }

}
