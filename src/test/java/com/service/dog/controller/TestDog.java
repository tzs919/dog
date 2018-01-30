package com.service.dog.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDog {

        DogDelegate dogDelegate = new DogDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = dogDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}