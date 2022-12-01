package Day_1;

import java.util.Comparator;
import java.util.List;

public class Elve implements Comparable<Elve>{

    private final List<Integer> backpack;
    private final int sumBackpack;

    public Elve(List<Integer> backpack){
        this.backpack = backpack;
        this.sumBackpack = backpack.stream().mapToInt(Integer::intValue).sum();
    }

    public int getSumBackpack() {
        return sumBackpack;
    }

    @Override
    public boolean equals(final Object object){
        if(object == this){
            return true;
        }
        if(!(object instanceof Elve)){
            return false;
        }
        final Elve castedTemperature = (Elve) object;
        return (castedTemperature.getSumBackpack() == this.getSumBackpack());
    }

    @Override
    public int compareTo(Elve other){
        return Integer.compare(this.getSumBackpack(), other.getSumBackpack());
    }


}
