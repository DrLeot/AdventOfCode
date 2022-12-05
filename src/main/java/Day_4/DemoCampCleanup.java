package Day_4;

import Util.Elve;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public final class DemoCampCleanup {

    public static String path = "src/main/resources/D4Q1.txt";

    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;
        if (new File(path).exists()) {
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

                String line;

                while ((line = br.readLine()) != null) {
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
            } catch (IOException ioex) {
                System.out.println(ioex.getMessage());
            }
            System.out.println("Intersection:" + counter);
            System.out.println("Overlaps:" + counter2);
        }
    }
}
