package Year_2022.Day_10;

import java.util.ArrayList;
import java.util.Arrays;

public final class SmallALU {

    private boolean boot = false;
    private ArrayList<Integer> registerXHistory = new ArrayList<>();

    private final char[][] display;

    public SmallALU(){
        display = null;
    }
    public SmallALU(int height, int width){
        display = new char[height][width];
        for (char[] chars : display) {
            Arrays.fill(chars, '.');
        }
    }

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
            draw(getCurrentCycleNumber(), getCurrentX());

            boot = true;
        }

        if (command.equals("noop")){
            registerXHistory.add(getCurrentX());
            draw(getCurrentCycleNumber(), getCurrentX());
        }

        if (command.equals("addx")){
            registerXHistory.add(getCurrentX());
            draw(getCurrentCycleNumber(), getCurrentX());

            registerXHistory.add(getCurrentX()+parameter);
            draw(getCurrentCycleNumber(), getCurrentX());
        }
    }

    public void draw(int currentCycle, int currentX){
        if (display == null){ // non display support
            return;
        }
        currentCycle++;
        int dividor = currentCycle / display[0].length;
        currentCycle = currentCycle%display[0].length;

        currentX++;

        if (currentCycle >= (currentX -1) && currentCycle <= (currentX +1)){
            //display[dividor][(currentCycle-1)%display[0].length] = '#';
            display[dividor][Math.abs((currentCycle-1)%display[0].length)] = '#';
        }
    }

    public int getCurrentCycleNumber(){
        return registerXHistory.size()-1;
    }

    public int getCurrentX(){
        return registerXHistory.get(registerXHistory.size()-1);
    }

    public int getXByCycleNumber(int cycle){
        return registerXHistory.get(cycle-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] chars : display) {
            for (char aChar : chars) {
                sb.append(aChar);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
