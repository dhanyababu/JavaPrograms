package Mjuk19_package;

public class Increment {
    public int inc(int value){
        int incValue=value;
        for(int i=1;i<1000;i++){
            incValue = incValue + value;
            System.out.println(incValue);
        }
        return incValue;

        }
    }

