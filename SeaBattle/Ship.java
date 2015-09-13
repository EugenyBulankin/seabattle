package SeaBattle;

public class Ship {
    Byte length;
    Point leftUp;
    boolean isHorizontal;
    boolean isALive;
    Short[] cells;

    void setCells(Byte l){
        length = l;
        cells = new Short[length];
    }

}
