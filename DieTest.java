package Mjuk19_package;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    private TestInfo info;

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
        this.info = info;
        System.out.println("Current test :"+info.getDisplayName());
    }

    @AfterEach
    void AfterEach(TestInfo info){
        this.info = info;
        System.out.println("Current test finished :"+info.getDisplayName());
    }
    @ParameterizedTest
    @DisplayName("Testing the Roll die ")
    @ValueSource(ints ={6,10,20,100,1000})
    void DieTest(int sideValue){
        Die die= new Die(sideValue);
        die.roll();
        //System.out.println(die.getValue());
        assertTrue(die.getValue()<=sideValue);
    }

}