package Day_5;

import Day_2.Battle;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DemoCranePlace {

    public static final String path = "src/main/resources/D5Q1.txt";
    public static final String craneSetup = "" +
            "[ ] [ ] [ ] [G] [W] [ ] [ ] [Q] [ ]\n" +
            "[Z] [ ] [ ] [Q] [M] [ ] [J] [F] [ ]\n" +
            "[V] [ ] [ ] [V] [S] [F] [N] [R] [ ]\n" +
            "[T] [ ] [ ] [F] [C] [H] [F] [W] [P]\n" +
            "[B] [L] [ ] [L] [J] [C] [V] [D] [V]\n" +
            "[J] [V] [F] [N] [T] [T] [C] [Z] [W]\n" +
            "[G] [R] [Q] [H] [Q] [W] [Z] [G] [B]\n" +
            "[R] [J] [S] [Z] [R] [S] [D] [L] [J]";

    public static void main(String[] args){
        CranePlace cranePlace = new CranePlace(craneSetup, 9);
        CranePlace cranePlace2 = new CranePlace(craneSetup, 9);

        if(new File(path).exists()) {
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

                String line;
                while ((line = br.readLine()) != null) {
                    String[] split = line.split(" ");
                    cranePlace.move(Integer.parseInt(split[3]),Integer.parseInt(split[5]),Integer.parseInt(split[1]));
                    cranePlace2.moveBlock(Integer.parseInt(split[3]),Integer.parseInt(split[5]),Integer.parseInt(split[1]));
                }

            } catch (IOException ioex) {
                System.out.println(ioex);
            }
        }
        System.out.println(cranePlace.getMessage());
        System.out.println(cranePlace2.getMessage());
    }
}
