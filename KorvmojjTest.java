package Mjuk19_package;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class KorvmojjTest {

    @Test
    @DisplayName("Testing the korvmoji Class ")
    void korvmojiTest() {
        Korvmojj korvmojj = new Korvmojj(0);
        Person person = new Person("Dhanya","Babu",31,true);
        korvmojj.feedSausageToPerson(person);
        assertEquals(true,person.getHungryStatus());


    }
}