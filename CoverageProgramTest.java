package Mjuk19_package;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CoverageProgramTest {
    @ParameterizedTest
    @DisplayName("Testing the coverage")
    @CsvSource(value ={"5,true","0,false"})
    void CoverageTest(int num,boolean b){
        CoverageProgram coverageProgram =new CoverageProgram();
        assertEquals(b,coverageProgram.CheckNumber(num));

    }



}