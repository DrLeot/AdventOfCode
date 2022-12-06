package Year_2022.Day_3;
import Year_2022.Util.FileReader;

import java.io.*;
import java.util.ArrayList;

public class DemoBackPack {

    public static String path = "src/main/resources/D3Q1.txt";

    public static void main(String[] args){
        int sum = 0;
        int sumGroup = 0;
        int counter = 0;
        BackPack[] backBackGroup = new BackPack[3];
        FileReader fileReader = new FileReader(path);
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line:lines){
            try {
                backBackGroup[counter] = new BackPack(line);
                sum += BackPack.getPriorityItemValue(backBackGroup[counter].getPriorityItem());
                counter++;

                if(counter > 2){
                    sumGroup += BackPack.getPriorityItemValue(BackPack.getCommonCharacter(backBackGroup[0], backBackGroup[1], backBackGroup[2]));
                    counter = 0;
                }
            }catch (Exception ex){
                System.out.println(ex);
            }
        }
        System.out.println(sum);
        System.out.println(sumGroup);

    }
}
