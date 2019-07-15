package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class CapitalTest {
    Capital capital;
    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        this.capital=new Capital();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        capital=null;
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
    public void givenCharShouldReturnCaseValue(){
        char ch='a';
        String results=capital.checkCases(ch);
        String  expectedres="small";
        assertEquals(expectedres,results);
    }

}