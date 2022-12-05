package Util;

import java.util.List;

public class Elve implements Comparable<Elve>{

    private final List<Integer> backpack;
    private final int sumBackpack;
    private final int sectionIDFrom;
    private final int sectionIDTo;

    public Elve(List<Integer> backpack, int sectionIDFrom, int sectionIDTo){
        this.backpack = backpack;
        this.sumBackpack = backpack.stream().mapToInt(Integer::intValue).sum();

        this.sectionIDFrom = sectionIDFrom;
        this.sectionIDTo = sectionIDTo;
    }

    public static boolean SectionIntersects(Elve a, Elve b){
        return (a.sectionIDFrom <= b.sectionIDTo) && (b.sectionIDFrom <= a.sectionIDTo);
    }

    public static boolean SectionOverlaps(Elve a, Elve b){
        return(a.sectionIDFrom <= b.sectionIDFrom && a.sectionIDTo >= b.sectionIDTo)
        || (a.sectionIDFrom >= b.sectionIDFrom && a.sectionIDTo <= b.sectionIDTo);
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
