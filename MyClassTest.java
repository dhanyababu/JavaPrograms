package Mjuk19_package;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @BeforeAll
    static void beforeAll(){

        System.out.println("Testing starts ");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Testing is done ");

    }

    @BeforeEach
     void beforeEach(TestInfo info){
        System.out.println("Current test :"+info.getDisplayName());
    }
    @AfterEach
    void AfterEach(TestInfo info){
        System.out.println("Current test finished :"+info.getDisplayName());
    }
    @Test
    void length_test(){
        String testString = "Hej";
        int expectedLength =3;
        int actualLength = testString.length();
       assertEquals(expectedLength,actualLength);
    }

    @Test
    void isEmpty_test(){
        String testString = "";
        boolean actual = testString.isEmpty();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Testing the string function")
    void containsString_test(){
        String testString = "Hello world";
        boolean actual = testString.contains("a");

       // assertEquals(true,actual);

        //assertTrue(actual);
        //assertFalse(actual);
        //assertNull(testString);
       // assertNotNull(testString);
        //assertTrue(testString.contains("ll"));
       //assertFalse(testString.contains("aa"));
       assertNotNull(testString,"null");
       //assertNull(testString,"null");
    }
    @ParameterizedTest
    @DisplayName("Testing the negative function")
    @ValueSource(ints ={5,10,20,100,1000})
    void negativeTest(int vs){
        MyClass mc1=new MyClass();
        assertTrue(mc1.negative(vs)<0);
    }

    @ParameterizedTest(name = "{0} negative is {1}")
    @DisplayName("Testing the negative function")
    @CsvSource(value ={"5,-5","10,-10","20,-20","100,-100"})
    void negativeTest(int expected,int actual){
        MyClass mc1=new MyClass();
        assertEquals(expected,mc1.negative(actual));

    }


    @ParameterizedTest
    @DisplayName("Testing Strings are longer than zero")
    @ValueSource(strings ={"a","ab","abcd","abcdefg","hijklmnopq"})
    void lengthOfString(String str){
        assertTrue(str.length()>0);
    }

    @ParameterizedTest
    @DisplayName("Testing Strings are longer than zero using csv")
    @CsvSource(value ={"1,a,","2,ab","4,abcd","7,abcdefg","10,hijklmnopq"})
    void lengthOfString(int expected ,String actual){
        assertEquals(expected,actual.length());
    }



















}