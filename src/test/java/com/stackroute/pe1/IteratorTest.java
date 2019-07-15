package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class IteratorTest {
    Iterator ite;

    @Before
    public void setup(){
        //arrange
        System.out.println("Inside Before");
        ite=new Iterator();
    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        ite=null;
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
    public void givenNumberShouldReturnIteration(){
        //arrange
        int actualResult[];
        //act
        actualResult = ite.iteration(5);
        int expectedResult[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        //assert
        assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void givennumberAndnullShouldReturnErrorMassege()
    {
        //arrange
        int actualResult[];
        //act
        actualResult = ite.iteration(0);
        assertNotNull(actualResult);
        //assert
        assertEquals("null value not allowed", actualResult);

    }
}