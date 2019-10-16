package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject29cm {

        Project29cmDelegate project29cmDelegate = new Project29cmDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project29cmDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}