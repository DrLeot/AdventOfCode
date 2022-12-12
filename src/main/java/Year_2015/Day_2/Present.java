package Year_2015.Day_2;

import java.util.Arrays;

public class Present {

    private final int length;
    private final int width;
    private final int height;

    public Present(int l, int w, int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public int getArea(){
        return 2*length*width + 2*width*height + 2*height*length;
    }

    public int getSmallestArea(){
        int a = length*width;
        int b = width*height;
        int c = height*length;

        if(a <= b && a <= c){
            return a;
        }
        if(b <= a && b <= c){
            return b;
        }
        return c;
    }

    public int[] dimensionsOrderedBySize(){
        int[] ret = {length, width, height};

        Arrays.sort(ret);
        return ret;
    }

    public int getWrappingArea(){
        return this.getArea() + this.getSmallestArea();
    }

    public int getRibbonLength(){

        return (2*dimensionsOrderedBySize()[0]+2*dimensionsOrderedBySize()[1])+(length*width*height);
    }
}
