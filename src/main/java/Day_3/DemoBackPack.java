package Day_3;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class DemoBackPack {

    public static String path = "src/main/resources/D3Q1.txt";

    public static void main(String[] args){
        int sum = 0;
        int sumGroup = 0;
        int counter = 0;
        BackPack[] backBackGroup = new BackPack[3];
        if(new File(path).exists()) {
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

                String line;

                while ((line = br.readLine()) != null) {
                    backBackGroup[counter] = new BackPack(line);
                    sum += BackPack.getPriorityItemValue(backBackGroup[counter].getPriorityItem());
                    counter++;

                    if(counter > 2){
                        sumGroup += BackPack.getPriorityItemValue(BackPack.getCommonCharacter(backBackGroup[0], backBackGroup[1], backBackGroup[2]));
                        counter = 0;
                    }
                }

            } catch (Exception ioex) {
                System.out.println(ioex.getMessage());
            }
        }
        System.out.println(sum);
        System.out.println(sumGroup);
    }
}
