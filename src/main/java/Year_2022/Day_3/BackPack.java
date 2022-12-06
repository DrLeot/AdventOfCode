package Year_2022.Day_3;

import java.util.Arrays;

public class BackPack {

    private final char[] compartmentLeft;
    private final char[] compartmentRight;

    public BackPack(String contents){
        compartmentLeft = contents.substring(0, (contents.length()/2)).toCharArray();
        compartmentRight = contents.substring(contents.length()/2).toCharArray();
    }

    public static char getCommonCharacter(final BackPack a, final BackPack b, final BackPack c){

        for(int i = 0; i<a.getCompartment().length;i++){
            for(int j = 0; j<b.getCompartment().length;j++){
                if(a.getCompartment()[i] == b.getCompartment()[j]){
                    for(int k = 0; k<c.getCompartment().length;k++){
                        if(b.getCompartment()[j] == c.getCompartment()[k]){
                            return c.getCompartment()[k];
                        }
                    }
                }
            }
        }

        return 'a';
    }

    public char[] getCompartmentLeft() {
        return compartmentLeft;
    }

    public char[] getCompartmentRight() {
        return compartmentRight;
    }

    public char[] getCompartment(){
        char[] both = Arrays.copyOf(getCompartmentLeft(), getCompartmentLeft().length + getCompartmentRight().length);
        System.arraycopy(getCompartmentRight(), 0, both, getCompartmentLeft().length, getCompartmentRight().length);

        return both;
    }

    public static int getPriorityItemValue(char item) throws Exception{

        if((int)item >= 97){ // lowercase
            return (int)item - 96;
        }else{ // upper
            return (int)item - 38;
        }
    }

    public char getPriorityItem() throws Exception {
        for(int i = 0; i < this.compartmentLeft.length; i++){
            for(int a = 0; a < this.compartmentRight.length; a++){
                if(this.compartmentRight[i] == this.compartmentLeft[a]){
                    return this.compartmentLeft[a];
                }
            }
        }

        throw new Exception();
    }
}
