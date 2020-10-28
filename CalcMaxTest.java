package Mjuk19_package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcMaxTest {
    @Test
    void calculateMax(){
        int num1=21;
        int num2=34;
        int maxNum = Math.max(num1,num2);
        assertEquals(num2,maxNum);

    }
    @Test
    void calculateMin(){
        int number1=23;
        int number2=45;
        int minNUm = Math.min(number1,number2);
        assertEquals(number1,minNUm);

    }

}