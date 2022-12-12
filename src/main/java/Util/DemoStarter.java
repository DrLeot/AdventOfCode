package Util;

import Year_2015.Day_1.DemoFloor;
import Year_2015.Day_2.DemoPackageWrapper;
import Year_2022.Day_10.SmallALUDemo;
import Year_2022.Day_2.DemoPaperRockScissors;
import Year_2022.Day_3.DemoBackPack;
import Year_2022.Day_4.DemoCampCleanup;
import Year_2022.Day_5.DemoCranePlace;
import Year_2022.Day_6.DemoTuningTrouble;
import Year_2022.Day_7.DemoConsole;
import Year_2022.Day_8.DemoMap;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.Year;

public class DemoStarter {

    public static ArrayList<AbstractStarter> starters = new ArrayList<>();


    public static void main(String[] args){
        starters.add(new DemoFloor());
        starters.add(new DemoPackageWrapper());
        starters.add(new DemoPaperRockScissors());
        starters.add(new DemoBackPack());
        starters.add(new DemoCampCleanup());
        starters.add(new DemoCampCleanup());
        starters.add(new DemoTuningTrouble());
        starters.add(new DemoConsole());
        starters.add(new DemoMap());
        starters.add(new SmallALUDemo());


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Year["+Year.now().getValue()+"] : ");
        String year = myObj.nextLine();
        if (year.equals("")){
            year = String.valueOf(Year.now().getValue());
        }
        for (AbstractStarter starter : starters) {
            if (starter.getYear().equals(year)){
                System.out.println("["+starter.getDay()+"] -> "+starter.getName());
            }
        }
        String day = myObj.nextLine();
        for (AbstractStarter starter : starters) {
            if (starter.getYear().equals(year) && starter.getDay().equals(day)){
                starter.run();
            }
        }
    }
}
