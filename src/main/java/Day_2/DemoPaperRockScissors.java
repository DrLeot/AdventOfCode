package Day_2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DemoPaperRockScissors {

    public static String path = "src/main/resources/D2Q1.txt";

    public static void main(String[] args){
        int sum_lowmode = 0;
        int sum_promode = 0;

        if(new File(path).exists()) {
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

                String line;
                while ((line = br.readLine()) != null) {
                    sum_lowmode += new Battle(line.split(" ")[0],line.split(" ")[1], false).getResult();
                    sum_promode += new Battle(line.split(" ")[0],line.split(" ")[1], true).getResult();
                }

            } catch (IOException ioex) {
                System.out.println(ioex);
            }
        }
        System.out.println(sum_lowmode);
        System.out.println(sum_promode);
    }
}
