package com.java.class26;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {

    @Before
    public void setUp(){
        System.out.println("Hello");
    }
    @Test
    public void verifyUserCanLogOut(){
        System.out.println("Test 2");
    }
    @Test
    public void verifyUserCanLogIntoTheApp(){
        System.out.println("Test 1");
    }
    @After
    public void cleanUp(){
        System.out.println("Close");
    }
}
