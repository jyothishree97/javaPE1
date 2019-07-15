package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;
   @Before
   public void setup(){
       //arrange
       System.out.println("Inside Before");
        this.junitDemo=new JunitDemo();
   }
   @After
   public void tearDown(){
       System.out.println("Inside After");
       junitDemo=null;
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
    public void givenTwoStringsShouldReturnConcattedUpperString() {

        //act
        String actualresult=junitDemo.concatAndUpperCase("hello","world");
        //assert
        assertNotNull(actualresult);
        assertEquals("HELLOWORLD",actualresult);

    }
    @Test
    public void givenStringAndNullShouldRtuenErrorMessage(){

        //act
        String actualresult=junitDemo.concatAndUpperCase("hello",null);
        //assert
        assertNotNull(actualresult);
        assertEquals("null values not allowed",actualresult);
    }
    @Test
    public void givenStringShouldReturnTheReverseString(){
       //act
        String actualresult=junitDemo.reverseString("Hello");
        //assert
        assertEquals("olleH",actualresult);
    }
//    @Test(expected = NullPointerException.class)
//    public void givenNullShouldThrowNullPointerException(){
//       //act
//        String actualresult=junitDemo.nullString("Hello");
//       //assert
//        assertEquals("null",actualresult);
//    }
}