package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class OddTest {
     Odd odd;
    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        odd=new Odd();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        odd=null;
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
    public void givenNumberShouldReturnTomOrJerry() {
        int temp=26;
        String actualResults=odd.oddNumber(temp);
        String expectedResults="Jerry";
        assertEquals(expectedResults,actualResults);
    }
    @Test
    public void givennumberAndnullShouldReturnErrorMassege()
    {
        Odd num=new Odd();
        String actualResult=num.oddNumber(0);
        assertNotNull(actualResult);
        assertEquals("null value not allowed", actualResult);


    }

}

