package Mjuk19_package;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IncrementTest {
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

    @Test
    @RepeatedTest(10)
    void performance_Test(){
        Increment increment = new Increment();

       assertTimeout(Duration.ofMillis(200), () ->increment.inc(5));

    }

}