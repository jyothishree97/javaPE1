package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class PallindromeTest {
    Pallindrome pal;
    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        pal=new Pallindrome();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        pal=null;
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
    public void givenNumShouldReturnPallindromeOrNot(){
        int temp = 121;
        String result = pal.pallindrome(temp);
        String expectedResult = temp +"is a Pallindrome and the even number sum is less than 25";
        assertEquals(expectedResult, result);
    }

}