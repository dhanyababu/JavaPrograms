package Mjuk19_package;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


class IncrementsNumberTest {
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

    @ParameterizedTest(name = "{0}  random generated value ")
    @DisplayName(value = "Testing the parameterised function")
    @ValueSource(ints ={1,10,50,90,100,})
    public void testInputVal(int vs){
        IncrementsNumber iN1 = new IncrementsNumber();
        int calculatedVal=iN1.rValue(vs);
        assertTrue(iN1.randomValue > 0 && iN1.randomValue < 100);

    }

    @Test
    void Test_rValue() {
        IncrementsNumber iN1 = new IncrementsNumber();
        int calculatedVal=iN1.rValue(100);
        assertEquals(iN1.randomValue,(calculatedVal)/10000);

    }
}