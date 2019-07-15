package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessTest {
    Guess guess=new Guess();
    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        guess=new Guess();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        guess=null;
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }


    @Test
    public void givenNumberShouldReturn() {
        int temp=20,temp1=32;
        String actualResult=guess.gussNumber(temp,temp1);
        String expectedResult="Number guessed is more than original number";
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenNumberShouldReturnGuessnumVal() {
        int temp=28,temp1=10;
        String actualResult=guess.gussNumber(temp,temp1);
        String expectedResult="Number guessed is less than original number";
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givennumberAndnullShouldReturnErrorMassege()
    {
        Guess guess=new Guess();
        String actualResult=guess.gussNumber(0,0);
        assertNotNull(actualResult);
        assertEquals("null value not allowed", actualResult);


    }
}


