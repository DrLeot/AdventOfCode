package Day_5;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public final class CranePlace {

    ArrayList<Stack<Character>> craneStacks = new ArrayList<>();

    public CranePlace(String stacks, int width) {
        for (int a = 0; a <= width - 1; a++) {
            craneStacks.add(new Stack<>());
        }

        String[] matches = Pattern.compile("\\[(.*?)\\]")
                .matcher(stacks)
                .results()
                .map(MatchResult::group)
                .toArray(String[]::new);

        for (int i = matches.length - 1; i >= 0; i--) {
            if (!(matches[i].subSequence(1, matches[i].length() - 1).charAt(0) == ' ')) {
                craneStacks.get(i % width).push(matches[i].subSequence(1, matches[i].length() - 1).charAt(0));
            }
        }
    }

    public String getMessage(){
        String ret = "";
        for (Stack<Character> crane : craneStacks) {
            if(!crane.empty()){
                ret += crane.peek();
            }
        }
        return ret;
    }

    private void move(int from, int to){
        craneStacks.get(to-1).push(craneStacks.get(from - 1).pop());
    }

    public void move(int from, int to, int amount){
        for(int a = 0; a < amount; a++){
            move(from, to);
        }
    }

    public void moveBlock(int from, int to, int amount){
        char[] elements = new char[amount];
        for(int a = 0; a < elements.length; a++){
            elements[a] = craneStacks.get(from - 1).pop();
        }
        for(int a = elements.length - 1; a >= 0; a--) {
            craneStacks.get(to - 1).push(elements[a]);
        }

    }

    @Override
    public String toString() {
        String ret = "";
        for (Stack<Character> crane : craneStacks) {
            ret = ret + "\n" + crane.toString();
        }
        return ret;
    }
}
