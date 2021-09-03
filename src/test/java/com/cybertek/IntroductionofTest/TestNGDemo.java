package com.cybertek.IntroductionofTest;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class ");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("before method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @Test
    public void test1(){
        String word = "java";
        String word2 ="java";
        System.out.println("test1");
        Assert.assertEquals(word,word2);
    }

    @Ignore //it is for ignoring the follow test
    @Test
    public void test2(){
        String word = "java";
        String word2 ="javascript";
        System.out.println("test2");
        Assert.assertEquals(word,word2);
    }

    @Test
    public void test3(){
        System.out.println("test3");
        Assert.assertTrue(5>1);
        throw new SkipException("just skipped");

    }

    @Test
    public void test4(){
        String word = "javascript";
        String word2 ="javascript";
        System.out.println("test4");
        Assert.assertEquals(word,word2);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class ");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

}
