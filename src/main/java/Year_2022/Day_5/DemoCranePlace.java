package Year_2022.Day_5;

import Year_2022.Util.FileReader;

import java.io.*;
import java.util.ArrayList;

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
        Year_2022.Util.FileReader fileReader = new FileReader(path);
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line:lines) {
            String[] split = line.split(" ");
            cranePlace.move(Integer.parseInt(split[3]),Integer.parseInt(split[5]),Integer.parseInt(split[1]));
            cranePlace2.moveBlock(Integer.parseInt(split[3]),Integer.parseInt(split[5]),Integer.parseInt(split[1]));
        }
        System.out.println(cranePlace.getMessage());
        System.out.println(cranePlace2.getMessage());


    }
}
