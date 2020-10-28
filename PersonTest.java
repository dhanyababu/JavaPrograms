package Mjuk19_package;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
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
    @ParameterizedTest
    @DisplayName("Testing the Person Classs ")
    @CsvSource(value ={"Dhanya,Babu,31,true"})
    void personTest(String fName,String lName,int age,boolean hung){
        Person person = new Person("Dhanya","Babu",31,true);
         person.setLastName("Rineesh");
        System.out.println(person.getLastName());
        assertEquals(lName,person.getLastName());
        //person.setHungryStatus(false);
       // assertEquals(hung,person.getHungryStatus());
        //assertEquals(fName +" "+ lName +" "+ age +" "+ hung,person.toString());

    }






}