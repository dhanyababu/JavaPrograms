package Mjuk19_package;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.runners.Parameterized.*;
class AdderTest {
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
    @ParameterizedTest(name = "{0} and {1} sum is {2}")
    @DisplayName("Testing the adder function")
    @CsvSource(value ={"5,5,10","10,10,20"})
    void negativeTest(int num1,int num2,int expected){
        Adder adder=new Adder();
        assertEquals(expected,adder.add(num1,num2));

    }

    @Test
    @RepeatedTest(10)
    void performance_TestAdder(){
        Adder adder=new Adder();
        assertTimeout(Duration.ofMillis(200), () -> adder.add(2,3));

    }


    }