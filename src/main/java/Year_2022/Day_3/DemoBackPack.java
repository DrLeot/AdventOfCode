package Year_2022.Day_3;
import Util.AbstractStarter;
import Util.FileReader;

import java.io.*;
import java.util.ArrayList;

public class DemoBackPack extends AbstractStarter {

    public DemoBackPack(){
        super("2022", "3", "Rucksack Reorganization","src/main/resources/2022/D3Q1.txt");
    }

    @Override
    public void run() {
        int sum = 0;
        int sumGroup = 0;
        int counter = 0;
        BackPack[] backBackGroup = new BackPack[3];
        FileReader fileReader = new FileReader(getInput());
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
