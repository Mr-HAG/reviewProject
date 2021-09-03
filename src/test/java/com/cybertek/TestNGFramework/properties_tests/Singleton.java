package com.cybertek.TestNGFramework.properties_tests;

import java.sql.SQLOutput;

public class Singleton {

    //no body can be allowed to create an object from this class
    //singleton class has private constructor
    private Singleton(){}

    private static String str;

    public static String getInstance(){
        //if str has no value, initialize it and return it
        if(str == null){
            System.out.println("str is null. assigning value to it");
            str = "somevalue";

        }else{
            //if it has value just return it
            System.out.println("it has value just return it");
        }
        return str;
    }


}
