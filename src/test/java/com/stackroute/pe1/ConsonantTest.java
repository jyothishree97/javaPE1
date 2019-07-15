package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsonantTest {
     Consonant consnant;
    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        consnant=new Consonant();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        consnant =null;
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
    public void givenStringShouldReturnVowelOrNot(){
        String s="a";
        String result=consnant.checkVowel(s);
        String expectedresult= s + "is a vowel" ;
        assertEquals(expectedresult,result);


    }

}