package com.cybertek.TestNGFramework.DDF;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object[][] testData(){
            String[][] data = {
                    {"Person of interest","10"},
                    {"Killing Eve","8"},
                    {"GOT","9"},
                    {"Breaking Bad","10"},
                    {"Dark","10"},
                    {"Dexter","9"},
                    {"Friends","10"}
            };

            return data;
    }

    @Test(dataProvider = "testData")
    public void test1(String tvShow,String rating){

        System.out.println("TV Show: " + tvShow + " has rating " + rating);

    }
}
