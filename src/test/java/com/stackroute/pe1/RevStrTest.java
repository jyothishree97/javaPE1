package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class RevStrTest {
    RevStr rvs;
    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        this.rvs=new RevStr();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        rvs=null;
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
    public void givenStringShouldReturnTheReverseString(){
        //act
        String actualresult=rvs.reverseString("Hello");
        //assert
        assertEquals("olleH",actualresult);
    }
}
