package Year_2022.Day_10;

import java.util.ArrayList;

public final class SmallALU {

    private boolean boot = false;
    private ArrayList<Integer> registerXHistory = new ArrayList<>();

    public void operation(String[] commands){
        for (String command:commands) {
            String[] splitted = command.split(" ");
            operation(splitted[0],splitted.length > 1 ? Integer.parseInt(splitted[1]) : 0);
        }
    }

    public void operation(String command, int parameter){
        // at first cycle
        if (!boot){
            registerXHistory.add(1);
            boot = true;
        }

        if (command.equals("noop")){
            registerXHistory.add(getCurrentX());
        }

        if (command.equals("addx")){
            registerXHistory.add(getCurrentX());
            registerXHistory.add(getCurrentX()+parameter);
        }
    }

    public int getCurrentX(){
        return registerXHistory.get(registerXHistory.size()-1);
    }

    public int getXByCycleNumber(int cycle){
        return registerXHistory.get(cycle-1);
    }
}
