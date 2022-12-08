package Year_2016.Day_3;

import Year_2022.Util.Elve;

public class House{

    private int posX;
    private int posY;

    public House(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public boolean equals(final Object object){
        if(object == this){
            return true;
        }
        if(!(object instanceof House)){
            return false;
        }
        final House castedHouse = (House) object;
        return (castedHouse.posX == this.posX && castedHouse.posY == this.posY);
    }

}
