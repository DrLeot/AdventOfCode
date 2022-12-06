package Year_2022.Day_6;

public class CharStream {

    private final String stream;

    public CharStream(final String stream){
        this.stream = stream;
    }

    /**
     * Return the last index of the first apperance.
     * e.g.: return is 7, then the unique message is from (7-n) up to 7
     * @param n length of unique apperance
     * @return last index of first apperance
     */
    public int firstUniqueApperanceIndex(int n){

        for(int i = 0; i<=stream.length();i++) {
            if (!hasDuplicates(stream.substring(i,i+n).toCharArray())){
                return i+n;
            }
        }
        return 0;
    }

    public static boolean hasDuplicates(char[] value){
        for(int i = 0; i <value.length; i++) {
            for(int j = i+1; j <value.length; j++) {
                if(value[i] == value[j] && value[i] != ' ') {
                    return true;
                }
            }
        }
        return false;
    }
}
