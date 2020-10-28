package Mjuk19_package;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BigClassTest {
    @ParameterizedTest
    @DisplayName("Testing Big Class ")
    @CsvSource(value ={"31,Hello","0,HAI","23,null,","0,null","225,HELLO"})
    void BigTest(int testNum,String testText) {
       //BigClass bigClass = new BigClass(12, "Hello");
        BigClass bigClass = new BigClass("Hai");
        //BigClass bigClass = new BigClass(23);
        //BigClass bigClass = new BigClass();
        //bigClass.setText("Hello");
        //bigClass.setNumber(23);
        bigClass.textToUppercase();
      assertEquals(testText,bigClass.getText());
        //bigClass.replaceNumber(225);
      assertEquals(testNum,bigClass.getNumber());

      String testString=bigClass.toString();
      assertEquals("number is" + testNum +"text='" + testText,testString);
    }





}