package Mjuk19_package;

import java.util.Random;

public class IncrementsNumber {
    public static int randomValue;
    //private static final int randomValue = 100
    public static int rValue(int n){
        Random random = new Random();
        randomValue = random.nextInt(n)+1;
        return (randomValue)*10000;
    }



}
