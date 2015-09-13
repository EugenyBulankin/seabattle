package SeaBattle;

import java.util.Random;

public final class RandomRage {

    public static int showRandomInteger(int aStart, int aEnd){

        java.util.Random aRandom = new java.util.Random();

        if ( aStart > aEnd ) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)aEnd - (long)aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long)(range * aRandom.nextDouble());

        return (int)(fraction + aStart);
    }
}
