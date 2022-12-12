package Year_2022.Day_4;

import Util.AbstractStarter;
import Year_2022.Util.Elve;
import Util.FileReader;

import java.io.*;
import java.util.ArrayList;

public final class DemoCampCleanup extends AbstractStarter {

    public DemoCampCleanup(){
        super("2022", "3", "Camp Cleanup","src/main/resources/2022/D3Q1.txt");
    }

    @Override
    public void run() {
        int counter = 0;
        int counter2 = 0;
        FileReader fileReader = new FileReader(getInput());
        ArrayList<String> lines = new ArrayList<>();

        try {
            lines = fileReader.readAllLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line:lines) {
            String[] pairs = line.split(",");
            String[] left = pairs[0].split("-");
            String[] right = pairs[1].split("-");

            if (Elve.SectionOverlaps(
                    new Elve(new ArrayList<>(), Integer.parseInt(left[0]), Integer.parseInt(left[1])),
                    new Elve(new ArrayList<>(), Integer.parseInt(right[0]), Integer.parseInt(right[1])))) {
                counter++;
            }
            if (Elve.SectionIntersects(
                    new Elve(new ArrayList<>(), Integer.parseInt(left[0]), Integer.parseInt(left[1])),
                    new Elve(new ArrayList<>(), Integer.parseInt(right[0]), Integer.parseInt(right[1])))) {
                counter2++;
            }

        }
        System.out.println("Intersection:" + counter);
        System.out.println("Overlaps:" + counter2);
    }
}
