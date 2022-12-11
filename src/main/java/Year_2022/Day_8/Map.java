package Year_2022.Day_8;

import java.util.ArrayList;

public class Map {

    final int[][] trees;

    public Map(int width, int height, ArrayList<String> lines){
        trees = new int[width][height];

        int idx = 0;
        for(String line:lines){
            char[] lineSplitted = line.toCharArray();
            for(int i = 0; i < lineSplitted.length;i++){
                trees[idx][i] = lineSplitted[i] - '0';
            }
            idx++;
        }
    }

    public int getViewScore(final int x, final int y){
        int product = 1;

        if (x <= 0 || x >= trees.length || y <= 0 || y >= trees[0].length){ // edge
            return 0; // 0 times something always ends zero on the edge
        }

        // down
        int down = 0;
        for (int a = x+1; a < trees[x].length;a++){
            if (trees[a][y] >= trees[x][y]){
                down++;
                break;
            }
            down++;
        }
        product *= down;

        // up
        int up = 0;
        for (int a = x-1; a >= 0;a--){
            if (trees[a][y] >= trees[x][y]){
                up++;
                break;
            }
            up++;
        }
        product *= up;

        // left
        int left = 0;
        for (int a = y-1; a >= 0;a--){
            if (trees[x][a] >= trees[x][y]){
                left++;
                break;
            }
            left++;
        }
        product *= left;

        // right
        int right = 0;
        for (int a = y+1; a < trees.length;a++){
            if (trees[x][a] >= trees[x][y]){
                right++;
                break;
            }
            right++;
        }
        product *= right;

        return product;
    }

    public boolean isTreeVisible(final int x, final int y){
        boolean none = true;

        if (x <= 0 || x >= trees.length || y <= 0 || y >= trees[0].length){ // edge
            return true;
        }

        // down
        none = true;
        for (int a = x+1; a < trees[x].length;a++){
            if (trees[a][y] >= trees[x][y]){
                none = false;
                break;
            }
        }
        if (none){
            return true;
        }

        // up
        none = true;
        for (int a = x-1; a >= 0;a--){
            if (trees[a][y] >= trees[x][y]){
                none = false;
                break;
            }
        }
        if (none){
            return true;
        }

        // left
        none = true;
        for (int a = y-1; a >= 0;a--){
            if (trees[x][a] >= trees[x][y]){
                none = false;
                break;
            }
        }
        if (none){
            return true;
        }

        // right
        none = true;
        for (int a = y+1; a < trees.length;a++){
            if (trees[x][a] >= trees[x][y]){
                none = false;
                break;
            }
        }
        if (none){
            return true;
        }

        return false;
    }

    public int countVisible(){
        int sum = 0;
        for (int a = 0; a < trees.length; a++) {
            for (int b = 0; b < trees[a].length; b++) {
                if (isTreeVisible(a,b)){
                    sum++;
                }
            }
        }
        return sum;
    }

    public int getHighestViewScore(){
        int ret = 0;
        for (int a = 0; a < trees.length; a++) {
            for (int b = 0; b < trees[a].length; b++) {
                int temp = getViewScore(a,b);
                if (temp > ret){
                    ret = temp;
                }
            }
        }
        return ret;
    }
}
